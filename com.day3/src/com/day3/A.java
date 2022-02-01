package com.day3;

public class A {
	 
		protected void msg(){System.out.println("Hello java");}  
		}  
		  
		class Simple extends A{  
		protected void msg(){System.out.println("Hello java");} 
		 public static void main(String args[]){  
		   Simple obj=new Simple();  
		   obj.msg();  
		   }  
		}