
package Pattern;

public class pattern {
    static void p1(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
                {
                if(col<=row){
                System.out.print("* ");  //print on same line
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern2(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
                {
                if(col<=n-row+1){
                System.out.print("* ");  //print on same line
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern3(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
            {
                if(col<=n-row){
                System.out.print(" ");  //print on same line
            }
            else{
                System.out.print("*");
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    // static void pattern4(){    //static load things along with class during class load time
    //     int n=5;
    //     for(int row=1; row<=n; row++)
    //         {
    //         for(int col=1; col<=n; col++)
    //             {
    //             if(col<row){
    //             System.out.print(" ");  //print on same line
    //         }
    //         else{
    //             System.out.print("* ");
    //         }
    //         }
    //         System.out.println();   // Print a newline after each row
    //     }
    // }

    static void pattern4(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
            {
                if(col>=row){
                System.out.print("*");  //print on same line
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern5(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
            {
                if(row==1 || row==5 || col==1 || col==5){
                System.out.print("*");  //print on same line
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern6(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
            {
                if(row==col || col==n-row+1)
                {
                System.out.print("*");  //print on same line
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern7(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
                char ch='A';
            for(int col=1; col<=n; col++)
                {
                if(col<=row){          //print on same line
                    System.out.print((char)(ch+col-1));  
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern8(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
                char ch='A';
            for(int col=1; col<=n; col++)
                {
                if(col<=row){          //print on same line
                    System.out.print((char)(ch+col-1));  
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern9(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
            {
                if(col<=n-row){
                System.out.print(" ");  //print on same line
            }
            else{
                System.out.print("* ");
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }

    static void pattern10(){    //static load things along with class during class load time
        int n=5;
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n; col++)
            {
                if(col>=row || row==5 || col==1 || col==5){
                System.out.print("*");  //print on same line
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();   // Print a newline after each row
        }
    }
    public static void main(String[] args)
    {   
        p1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
        System.err.println();
        pattern6();
        System.out.println();
        pattern7();
        System.out.println();
        pattern8();
        System.out.println();
        pattern9();
        System.out.println();
        pattern10();
        
}
}
