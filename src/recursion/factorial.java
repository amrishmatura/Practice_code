package recursion;

public class factorial {
    //n! = n * (n-1)!

    static void fact(int n , int result){
        if(n==1){
            System.out.println(result);
            return;
        }
        fact(n-1, result*n);
    }
    

    static int fact(int n){
        if(n==1){
            return 1;
        }
        int result= fact(n-1);
        return result*n;

    }
    public static void main(String[] args) {
        fact(5);
    }
    
}

