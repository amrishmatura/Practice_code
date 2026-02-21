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
        System.out.println(c);      // again c did not create new amrish because it already availabler in string pool
        System.out.println(x==y );
        System.out.println(x==c );      // return ture b/c == compare address and both are pointing to same address

        // new string()
        String s = new String("Amrish");
        System.out.println(s);
        System.out.println(x==s); 

        /*above x==s return false because new String create two memory 
         one string pool & one outside it but refer to outside one */

        // to compare address of inside pool use .intern();

        String s2 = new String("Amrish").intern();
        System.out.println(s2==s);  // false of same reason of new string

        System.out.println(s2==x);  // true due to intern() , take pool address now 

        // Compare value

        System.out.println("Comparing value - " + s2.equals(s));
    
        
        // String are immutable  it crates new object or memeory every time when change are made
        String str1="Aman";
        System.out.println(str1);
        str1="Aman is a goood boy";

        //stringbuffer - methods are synchronization provide lock so othere thread cannot accces it if one is already using it

        System.out.println(str1);

        StringBuffer str = new StringBuffer("Amrish mAtura");
        str.append(" a btech student");
        System.out.println(str);


        /*stringbuilder _ it is a modern class , its method are not synchronized 
        so it will not lock its method for threads */

        StringBuilder str3 = new StringBuilder("Amrish mAtura");
        str3.append(" a btech student");
        System.out.println(str3);

        //achieve synchronization

        StringBuilder str4 = new StringBuilder("Amrish mAtura");
        synchronized (str4) {
            str4.append(" a btech student ");
        }
        System.out.println(str4);
        str4.append("OF DIT University");
        System.out.println(str4);
    }
}
    
