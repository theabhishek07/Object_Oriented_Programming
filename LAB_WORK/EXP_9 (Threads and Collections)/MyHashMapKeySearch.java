import java.util.*;

 //CheckKeyOfHashMapExample
public class MyHashMapKeySearch {
 
  public static void main(String[] args) {
   
    HashMap<String,String> hMap = new HashMap<String,String>();

    hMap.put("1","One");
    hMap.put("2","Two");
    hMap.put("3","Three");
    System.out.println("HashMap: "+hMap);
    System.out.println("Checking whether '3' key exists in HashMap : " + hMap.containsKey("3"));
    System.out.println("Checking whether 'One' Value exists in HashMap : " + hMap.containsValue("One"));
    System.out.println("Checking whether 'abc' Value exists in HashMap : " + hMap.containsValue("abc"));

    Set<String> keys = hMap.keySet();
    System.out.println("All keys :"+keys);
    Set<HashMap.Entry<String, String>> ent = hMap.entrySet();
    System.out.println("key-value pair as entry objects: "+ent);
    
  }
}
