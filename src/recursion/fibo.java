
package recursion;

public class fibo {
    static int Fibo(int n){
        if(n==0||n==1){
            return n;
        }
        int a=Fibo(n-1);
        int b=Fibo(n-2);
        int c=a+b;
        return c;


    }
    public static void main(String[] args) {
        System.out.println(Fibo(3));
    }
}
