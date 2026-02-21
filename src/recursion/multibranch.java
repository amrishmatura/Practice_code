package recursion;

//TC - 2^n

public class multibranch {
    static void multi(int x){
        if(x<=0){
            return;
        }
        System.out.println("pre call is " +x);   
        //multi branch
        multi(x-1);
        System.out.println("B/W call " +x);
        multi(x-2);
        System.out.println("Post call " +x);
    }

    public static void main(String[] args){
        multi(4);
    }
}
