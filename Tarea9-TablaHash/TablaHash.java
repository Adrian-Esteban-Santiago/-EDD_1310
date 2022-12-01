
package tablahash;


public class TablaHash<K,T> {

    private class Entry {
        public K key;
        public T valor;
        public int hash;

        public Entry(K key, T valor) {
            this.key = key;
            this.valor = valor;
            this.hash = key.hashCode();
        }

        @Override
        public boolean equals(Object otherEntry) {
            Entry other = (Entry) otherEntry;
            if(this.hash != other.hash) return false;
            return this.key.equals(other.key);
        }
    }

    private int tableSize;
    private ListasSimplementeLigadas<Entry>[] entries;

    public TablaHash(int tableSize) {
        this.tableSize = tableSize;
        this.entries = new ListasSimplementeLigadas[tableSize];
        for(int i = 0; i < tableSize; i++) {
            entries[i] = new ListasSimplementeLigadas();
        }
    }

    private int normalizeIndex(int hashKey) {
        return (hashKey & 0x7FFFFFFF) % tableSize;
    }

    public void add(K key, T valor) {
        Entry entrada = new Entry(key, valor);
        int indice = normalizeIndex(entrada.hash);
        if (entries[indice] == null) {
            entries[indice] = new ListasSimplementeLigadas();
            entries[indice].agregarAlInicio(entrada);
        } else {
            if (entries[indice].buscar(entrada) >= 0) {
                entries[indice].actualizar(entrada, entrada);
            } else {
                entries[indice].agregarAlInicio(entrada);
            }
        }
    }

    public T valueOf(K keyToSearch) {
        int bucketIndex = normalizeIndex(keyToSearch.hashCode());
        if (entries[bucketIndex] == null || entries[bucketIndex].estaVacio()) return null;
        Entry entry = new Entry(keyToSearch, null);
        Entry index = entries[bucketIndex].ObtenerValor(entry);
        if (index == null) return null;
        return index.valor;
    }

    public void remove(K keyToRemove) {
        Entry aux = new Entry(keyToRemove, null);
        int bucketIndex = normalizeIndex(keyToRemove.hashCode());
        entries[bucketIndex].eliminarValor(aux);
    }
    
}
