package com.lambton;

public class CollegeExample
{

    public static void main (String[] args)
    {
        int a;
        int b;
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("ADD : " + arithmetic.add(  10, 30 ) );
        System.out.println("SUB : " + arithmetic.sub( 10, 30 ));
        System.out.println("MUL : " + arithmetic.mul( 10, 30 ));
        System.out.println("DIV : " + arithmetic.div( 10, 30 ));

Student s1 = new Student();
s1.setMarks1(50);
s1.setMarks2(60);
s1.setMarks3(70);
s1.setMarks4(60);
s1.setMarks5(90);
s1.generateResult();
s1.calculatePercentage();
s1.calculateTotal();
        System.out.println(s1.getFullName());
        System.out.println(s1.getMarks1());
        System.out.println(s1.getMarks2());
        System.out.println(s1.getMarks3());
        System.out.println(s1.getMarks4());
        System.out.println(s1.getMarks5());



    }
}
