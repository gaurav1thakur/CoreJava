package ConstructorSuper;

public class ConstructorParentClass {

    public  ConstructorParentClass(){
        this(1,2,3);
        System.out.println("ConstructorParentClass : Default parameter");
    }

    public  ConstructorParentClass(int a){
        this();
        System.out.println("ConstructorParentClass: 1 parameter");
    }

    public  ConstructorParentClass(int a,int b){
        this(1);
        System.out.println("ConstructorParentClass: 2 parameter");
    }

    public ConstructorParentClass(int a,int b, int c){
        System.out.println("ConstructorSuper : 3 parameter");
    }
}
