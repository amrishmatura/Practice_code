package recursion;
/*
Recursiom - a function that call itself and form a loop
DFT achieve by recursion
1. Think of small problem and how to solve it
2. Base case - to stop recursion
3. Stack fall/ stack build
*/

public class first {
    static void printname(int n){
        //base case - to stop recursion
        if (n==0) {
            return; // exit from function call
        }
    System.out.println("Amrish " + n);    //stack building phase
    printname(n-1);       //stack falling phase
    System.out.println("Matura " + n);
    }
    
    public static void main(String[] args) {
        printname(5);
    }
}