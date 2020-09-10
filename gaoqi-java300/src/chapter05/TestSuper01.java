package chapter05;
public class TestSuper01 { 
    public static void main(String[] args) {
        new ChildClass(2);
    }
}
class FatherClass {
    public FatherClass(){
        System.out.println("FatherClass.FatherClass(0)");
    }
    public FatherClass(int a){
        System.out.println("FatherClass.FatherClass(1)");
    }
}
class ChildClass extends FatherClass {
    public ChildClass() {
    	//super();
    	System.out.println("ChildClass.ChildClass(1)");

    }
    
    public ChildClass(int a) {
    	//super(3);
    	this();
    	System.out.println("ChildClass.ChildClass(2)");
    }
}