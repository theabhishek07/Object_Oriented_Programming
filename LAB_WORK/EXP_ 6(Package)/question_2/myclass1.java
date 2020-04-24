/** importing balance package**/

package pack;
import mypack.*;
import java.util.Arrays;
import Balance.*;

public class myclass1 {
    public static void main(String[] args) {
        myclass obj =new myclass();
        obj.msg();
        int Arr[]={2,4,1,5,6};
        Arrays.sort(Arr);
 System.out.println("Integer Array: "
                           + Arrays.toString(Arr)); 
        account obj1=new account();//using the balance package
        System.out.println(obj1.display_balance(100));
 
    }
    
}
