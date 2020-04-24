/** importing self created package and built in package**/

package pack;
import mypack.*;
import java.util.Arrays;
import Balance.*;

public class myclass1 {
    public static void main(String[] args) {
        myclass obj =new myclass();
        obj.msg();//self created package method
        int Arr[]={2,4,1,5,6};
        Arrays.sort(Arr);//built in package ussage
 System.out.println("Integer Array: "
                           + Arrays.toString(Arr)); 
        account obj1=new account();
        System.out.println(obj1.display_balance(100));
 
    }
    
}
