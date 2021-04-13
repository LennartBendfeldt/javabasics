package com.company;

public class Circle {


    public static void doPrint(){

//          Illegal start of expression
//        String thisString = ;

//        System.out.println(thisString);



//-----------------------------------------------------------------------------------------------




        //No error, but nothing printed
        String thisString = "";
        System.out.println(thisString);

        Integer thisInteger = 4;

        System.out.print(thisInteger);

//        java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
//        thisInteger = "hello";

        System.out.println(thisInteger);



 //-----------------------------------------------------------------------------------------------



//        java: ';' expected, No spaces allowed in variable names.
//        String my String = "here is a string";

//        System.out.println(my String);



//-----------------------------------------------------------------------------------------------



//        java: cannot find symbol
//        symbol:   variable Integer
//        location: class com.company.Circle

//        Integer = 5;
//
//        System.out.println(Integer);





//-----------------------------------------------------------------------------------------------






//        java: ';' , special characters like "!" are not allowed.

//        String excitedString! = "my string";
//        System.out.println(excitedString!);




//-----------------------------------------------------------------------------------------------



//        java: bad operand types for binary operator '-'
//        first type:  java.lang.String
//        second type: java.lang.Integer

        String thirdString = "";
        Integer lennartsInteger = 3;

        System.out.println(thirdString - lennartsInteger);


    }
}
