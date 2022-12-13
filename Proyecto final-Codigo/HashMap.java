
package hashmap;


public class HashMap {

   java.util.HashMap<String, String> MyHashMap;
    public HashMap(int table_size){
        MyHashMap = new java.util.HashMap<>();
    }

    public void add(String key, String value){
        MyHashMap.put(key, value);
    }

    public String valueOf(String key){
        return MyHashMap.get(key);
    }

    public void remove( String key){
        MyHashMap.remove(key);

    }
}
