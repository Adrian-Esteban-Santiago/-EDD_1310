
package linkedhashmap;


public class LinkedHashMap {

    java.util.HashMap<String, String> MiHashMap;
    public LinkedHashMap(int table_size){
        MiHashMap = new java.util.HashMap<>();
    }

    public void add(String key, String value){
        MiHashMap.put(key, value);
    }

    public String valueOf(String key){
        return MiHashMap.get(key);
    }

    public void remove( String key){
        MiHashMap.remove(key);
    
    
}
}