package main.org.gradle.test;

import java.io.IOException;
import java.util.HashMap;

public class HelloWorld {
	public String sayHello(String name){ 
		int data1[] = { 1, 2, 3, };
		int data2[] = new int[3];
		 int[] data3 = new int[]{ 1, 2, 3 };
		 int[]data4[] = new int[3][4];
		
        return "Hello "+name; 
        
    }
	
	private static void method() throws IOException {
		throw new Error();
	}
	
	public static void main(String[] a) {
		System.out.println("auto build test 2!");
		int m = 0;
		m += 0.1;
		System.out.println(m);
		HashMap map = new HashMap();
		 map.put("key1", "value1");
		 map.put("key2", "value2");
		 map.put("key1", "value3");
		 String value = (String)map.get("key1");
		System.out.println(value);
		
		
		String before = "abcdefg";
	    String after = before.substring(1, 7);
	    System.out.println( after );
		 try {
		      System.out.println( "Start." );
		      Thread.sleep(3000);
		      System.out.println( "End." );
		    } catch(InterruptedException ie) {}
		String str = "str";
	    try {
	      int i = Integer.parseInt(str);
	      System.out.print( "try, " );
	    } catch(Exception e) {
	      System.out.print( "Exception, " );
	    } finally {
	      System.out.print( "finally, " );
	    }
		
		HelloWorld h = new HelloWorld();
		Circle c = new Circle();
		Shape s = c;
		Circle anotherc = (Circle)s;
		System.out.println(anotherc.getClass());
		excute(c);
		Triangle t = new Triangle();
		excute(t);

		System.out.println(8/5*5);
		print();
	}
	
	static void excute (Shape a) {
		a.draw();
	}
	public static void print() {
		System.out.println( "Test#print" );
	}

}
