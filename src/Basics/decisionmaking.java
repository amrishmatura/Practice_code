package Basics;

public class decisionmaking {
    public static void main(String[] args) {
        int num =14;

        // simple if

        //even & odd approach

        //using modulus

        if(num%2==0){
            System.out.println("Even Number " + num);
        }
        else{
            System.out.println("Odd Number " + num);
        }

        //using XOR

        if((num^1)==num+1){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
         

        // using AND

        if((num&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

        //using OR

        if((num | 1)>num){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }


        // finding greater number in three using if-else
        //Nested if-else
        
        int num1=10;
        int num2=20;
        int num3=30;
        if(num1>num2){
            if(num1>num3){
            System.out.println(num1 + " is greatest");
            } 
            else{
                System.out.println(num3 +" third is greatest");
            }
        }
        else if(num2>num3){
            System.out.println(num2 + " is greatest");
        }
        else{
            System.out.println(num3 + " is greatest");
        }
    }

}