package Basics;

public class string {
    public static void main(String[] args) {

        // String literal

        String x ="Amrish";
        String y =x;              /*  both x and y are pointing to same addres of 
                                     AMrish in string pool in heap memory */
                                  
        System.out.println(x);
        System.out.println(y);
        String c = "Amrish";
        System.err.println(c);      // again c did not create new amrish because it already availabler in string pool
        System.err.println(x==y );
        System.err.println(x==c );      // return ture b/c == compare address and both are pointing to same address

        // new string()
        String s = new String("Amrish");
        System.err.println(s);
        System.err.println(x==s); 

        /*above x==s return false because new String create two memory 
         one string pool & one outside it but refer to outside one */

        // to compare address of inside pool use .intern();

        String s2 = new String("Amrish").intern();
        System.err.println(s2==s);  // false of same reason of new string
        
        System.err.println(s2==x);  // true due to intern() , take pool address now 

    }
}
    
