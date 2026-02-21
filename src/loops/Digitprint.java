
package loops;

class lab{
    public static void main(String[] args) {
        int n=12345;
        int copy=n;
        int pow=1;
        //power calculation
        while(copy!=0){
            copy=copy/10;
            pow=pow*10;
            System.err.println("Power"+pow);
        }
        pow=pow/10;
        System.out.println("Power is: "+pow);
        //logic print
        while(n!=0){
            System.out.println(n/pow);
            n=n%pow;
            pow=pow/10;
        }
        
        //O(n)
        

    //     int x=n%2;
    //     System.out.println(x);
    //     x++;
    //     System.out.println(x);
    //     x++;
    //     System.out.println(x);
    //     x++;
    //     System.out.println(x);
    //     x++;
    //     System.out.println(x);
}
}