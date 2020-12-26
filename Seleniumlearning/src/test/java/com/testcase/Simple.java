package com.testcase;



public class Simple {
	int Method2(int a,int b) {
		//local variable
		
		System.out.println("default Method2="+a+","+b);
		return b;
	}
public static void main(String args[]){
System.out.println("hello javatpoint");
Simple s = new Simple();
s.Method2(0,10);
}
	

}
