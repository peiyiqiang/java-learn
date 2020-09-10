package chapter04;

public class TestStatic {
    static String test;
    static {
        System.out.println("TestStatic.enclosing_method()");
        test = "testStatic";
        printTest();
    } 
    
    public static void printTest(){
        System.out.println(test);
    }  
    
    public static void main(String[] args) {
        System.out.println("User3.main(1)");
        
        Test t;
        
        System.out.println("User3.main(2)");
        
        t = new Test();
        
        System.out.println("User3.main(3)");
    }
}

class Test {
	Test() {
		System.out.println("Test.Test()");
	}
	static {
		System.out.println("Test.enclosing_method()");
	}
}