// Explaination of constructor Chaining
// This keyword for calling one constructor to another
// this is used for calling form one method to another
// this is used for variable differentiating
public class ConstructorThis {

    public ConstructorThis() {
        //calling to 3 parameterized constructor
        this(1, 2, 3);
        //Default Constructor
        System.out.println("default constructor");
    }

    public ConstructorThis(int a) {
        //calling default Constructor
        this();
        //1 parameterized Constructor
        System.out.println("1 parameterized constructor");
    }

    public ConstructorThis(int a, int b) {
        //Call to 1 parameterized constructor
        this(1);
        //2 parameterized Constructor
        System.out.println("2 parameterized constructor");
    }

    public ConstructorThis(int a, int b, int c) {
        //3 parameterized Constructor
        System.out.println("3 parameterized constructor");

    }

    public static void main(String args[]) {
//        3 parameterized constructor
//        default constructor
//        1 parameterized constructor
//        2 parameterized constructor
        ConstructorThis constructorThisTwo = new ConstructorThis(1,2);
    }

}
