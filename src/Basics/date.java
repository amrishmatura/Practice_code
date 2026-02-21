
package Basics;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        
        // current date 

        Date date = new Date();  
        System.out.println(date);

        //to make changes use Calendar method

        Calendar c= Calendar.getInstance();
        c.setTime(date);      //seting current date
        c.add(Calendar.MONTH, 6);    //here month will be 6 ahead
        System.out.println(c.getTime());

        // to format date 

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);   //short style of date
        System.out.println(df);
        System.out.println(df.format(c.getTime()));  //give short format of date which we provide by gettime which is the current date
    }

}
