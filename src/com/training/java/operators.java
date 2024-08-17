package com.training.java;

public class operators {

	public static void main(String[] args) {
		int a = 5;
        int b = 3;
        // Arithmetic operators
        System.out.println("a+b =" +(a+b));
        System.out.println("a-b =" +(a-b));
        System.out.println("a*b =" +(a*b));
        System.out.println("a/b =" +(a/b));
        System.out.println("a%b =" +(a%b));
        
     
        
        //Assignment operators
        
        a += b;
        System.out.println("a += b:" +a);
        a -= b;
        System.out.println("a -= b:" +a);
        a *= b;
        System.out.println("a *= b:" +a);
        a /= b;
        System.out.println("a /= b:" +a);
        a %= b;
        System.out.println("a %= b:" +a);
        
        //unary operators
        System.out.println("pre increment" +(++a));
        System.out.println("pre decrement" +(--b));
        System.out.println("post increment" +(a++)); 
        System.out.println("post decrement" +(b--));
        System.out.println("a after" + a++);
        System.out.println("b after" + b--);
        
        //Relation operators
       
        
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        //logical operators
        
     
        System.out.println((a>b) && (b>a));
        System.out.println((a>b) || (b>a));
        System.out.println(!(a==b));
        
        
        
        
           
}
}
