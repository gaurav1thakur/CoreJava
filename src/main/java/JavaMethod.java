public class JavaMethod {

    public int sum(int a, int b) {
        int sumResult = a + b;
        return sumResult;
    }

    public int sub(int a, int b) {
        int subResult = a - b;
        return subResult;
    }

    public int div(int a, int b) {
        int divResult = a / b;
        return divResult;
    }

    public int mul(int a, int b) {
        int mulResult = a * b;
        return mulResult;
    }

    public static void main(String args[]) {
        //Math is a class, on which abs is a static method. System.out is a static field rather than a class. So its println method isn't actually a static method, but an instance method on a static field.
        JavaMethod javaMethod = new JavaMethod();
        int resultOne = javaMethod.div(javaMethod.mul(javaMethod.sum(javaMethod.sub(javaMethod.sum(10, 2), 2), 2), 2), 2);
        int resultTwo = javaMethod.div(javaMethod.mul(javaMethod.sub(javaMethod.sum(javaMethod.sub(10, 2), 2), 2), 2), 2);
        int resultThree = javaMethod.mul(javaMethod.sub(javaMethod.sum(javaMethod.sub(javaMethod.div(10, 2), 2), 2), 2), 2);
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
//            (((((10+2)-2)+2)*2)/2 ----- 4methods
//            (((((10-2)+2)-2)*2)/2) ---- 4methods
//            (((((10/2-2)+2)-2)*2) ----- 4 method
    }

}