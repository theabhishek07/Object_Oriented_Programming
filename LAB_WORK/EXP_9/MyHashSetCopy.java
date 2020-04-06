import java.util.*;

class userDefined{
     
     String value;
     int n;
     
    public userDefined(String v, int n){
        this.value = v;
        this.n = n;
    }

    public int hashCode(){
	//	System.out.println("In hashcode");
		int hashcode = 0;
		hashcode = n*20;
		hashcode += value.hashCode();
		return hashcode;
	}
	
	public boolean equals(Object obj){
	//	System.out.println("In equals");
		if (obj instanceof userDefined) {
			userDefined ud = (userDefined) obj;
			return (ud.value.equals(this.value) && ud.n == this.n);
		} else {
			return false;
        }
    }
}

public class MyHashSetCopy {
 
  public static void main(String[] args) {
    
    HashSet<String> hSet = new HashSet<String>();
        hSet.add("first");
        hSet.add("second");
        hSet.add("third");
    System.out.println("Hash set: "+hSet);
    List<String> l = new ArrayList<String>();
        l.add("list element 1");
        l.add("list element 2");
    System.out.println("Array List: "+l);

    hSet.addAll(l);
    System.out.println("Hash set after copying array list to hash set : "+hSet);
    hSet.clear();
    System.out.println("Deleting all elements from hash set");
    System.out.println("Hash set: "+hSet);
    hSet.add("element 1");
    System.out.println("Adding 'element 1' in hash set");
    System.out.println("Hash set: "+hSet);


    HashSet<userDefined> uSet = new HashSet<userDefined>();
        uSet.add(new userDefined("object 1", 1));
        uSet.add(new userDefined("object 2", 2));
        uSet.add(new userDefined("object 3", 3));
      //  System.out.println("Hash set with user defined objects: "+uSet); 
      System.out.println("Checking whether set contains 'object 1' : "+uSet.contains(new userDefined("object 1", 1)));
        System.out.println("Checking whether set contains 'object 4' : "+uSet.contains(new userDefined("object 4", 1)));

  }
}
   
