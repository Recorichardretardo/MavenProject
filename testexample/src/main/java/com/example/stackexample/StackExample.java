package com.example.stackexample;

public class StackExample {
	int array[] = new int[5];
	int top = 0;
	
	public boolean push(int x) {
		top++;
		array[top]=x;
		System.out.println("Element pushed int o the stack : "+x);
		return true;
	}
	
	public int pop() {
		int x =  array[top--];
		System.out.println("Element popped from stack : "+x);
		return x;
	}
	
	public int peek() {
		return array[top];
	}

}
