import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//ArrayListIterator
 class  MyArrayListReverse{

	public static void main(String a[]){
		ArrayList<String> arrl = new ArrayList<String>();
		//adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Fourth");
		Iterator<String> itr = arrl.iterator();
		while(itr.hasNext()){
            System.out.println(itr.next());
        
        }
        
        System.out.println("Actual ArrayList: "+arrl);
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        System.out.println("Copied/Cloned ArrayList: "+copy);
        Collections.reverse(arrl);
        System.out.println("Reversed ArrayList: "+arrl);
	}
}
