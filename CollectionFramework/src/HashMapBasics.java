import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap stores key value pairs but insertion order is not preserved
//linkedHashMap-> insertion order preserved
//TreeMap-> sorted order
public class HashMapBasics {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

       //put(K,V) method-> puts the key and value
        map.put("en","England");
        map.put("in","India");
        map.put("in","India2");
        map.put("us","United States");
        System.out.println(map);

        Map<String, String> table = new HashMap<>();
        table.put("en","England");
        System.out.println("Before table:"+table);
        //putAll()->puts all the entries of one map to another
        table.putAll(map);
        System.out.println("After putAll() table:"+table);

        //remove(K)->removes any particular key from the map
        table.remove("en");
        System.out.println("After removing england:"+table);

        //size()-> returns the size of the table
        System.out.println("Table Size:"+table.size());

        //clear()-> clears or removes all the entries from the map
//        table.clear();
//        System.out.println("Clearing table:"+table);

        //putIfAbsent(K,V)-> put if that particular key is not associated to any value or any association of that key is not present in the map
        table.putIfAbsent("in","India5"); // "in" key will not get update as it is already associated to some value
        table.putIfAbsent("np","Nepal");// this will create a new key and add the value to it
        System.out.println(table);

        //get(K)-> gets any value associated with that particular key
        System.out.println(table.get("np"));

        //getOrDefault(K,defaultValue)-> return the value corresponding to this particular key and if not present then return the default value
        System.out.println(table.getOrDefault("use","none"));

        //containsKey(K)-> checks if the particular key is present or not
        System.out.println("in Key Present in table:"+table.containsKey("in"));

        //containsValue(V)-> checks if the particular value if present in the map or not
        System.out.println("Britain present in map:"+table.containsValue("Britain"));

        //replace(K,V)-> replace the value of the key with the new value
        table.replace("in","Indonesia");
        System.out.println("Replacing in with Indonesia:"+table);

        //replace(K,oldValue,newValue)-> replace the value of the key with the new value only if it is associated with the oldValue
        table.replace("in","Indonesia","India");
        System.out.println(table);

        //remove(K,V)-> removes the key entry only if it is associated with V

        //keySet()-> returns the Set of all keys
        Set<String> keys = table.keySet();
        System.out.println("Keys of table"+keys);

        //value()-> returns the Collection of all values
        Collection<String> values = table.values();
        System.out.println("Values of table"+values);

        //entrySet()-> returns the Set of all key and value pairs
        Set<Map.Entry<String,String>> keyVal=table.entrySet();
        System.out.println("All keys values:"+keyVal);

        //Iterate using entrySet using for loop



    }
}
