package co.edureka.except;

import java.io.IOException;

class MyClass{
  void logic() throws InterruptedException,IOException {
	  System.out.println("Logic Method Implementation...");
  }
}

public class ThrowsTest {
	public static void main(String[] args) throws Exception {
		MyClass obj = new MyClass();
		/*
		try {
		 obj.logic();
		}catch(Exception ex) {}
		*/
		obj.logic();
	}
}
