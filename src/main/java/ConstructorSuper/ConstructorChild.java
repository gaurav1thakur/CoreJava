package ConstructorSuper;

public class ConstructorChild extends ConstructorParentClass {

    public ConstructorChild() {
        this(1);
        System.out.println("Child : Default parameter");
    }

    public ConstructorChild(int a) {
        super(1,2);
        System.out.println("Child : 1 parameter");
    }

    public ConstructorChild(int a, int b) {
        this(1, 2, 3);
        System.out.println("Child : 2 parameter");
    }

    public ConstructorChild(int a, int b, int c) {
        this();
        System.out.println("Child : 3 parameter");
    }

    public static void main(String args[]) {
        ConstructorChild c = new ConstructorChild(1, 2);
    }
// parent 3 parameterized constructor
// parent default constructor
// parent 1 parameter constructor
//parent 2 parameter constructor
//child 1 parameter constructor
//child default constructor
//child 3 parameter constructor
//child 2 parameter constructor
}
