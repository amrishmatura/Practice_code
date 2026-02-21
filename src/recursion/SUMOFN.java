package recursion;

public class SUMOFN {
    static void sumofn(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumofn(n-1,sum+n);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        sumofn(10,0);
        System.out.println(sum(10));
    }

}
