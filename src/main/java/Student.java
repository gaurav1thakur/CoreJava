public class Student {

    int age;
    int roll_no;

    public void display1() {
        System.out.println("Welcome All");

    }

    public void display2() {

        System.out.println("Welcome to all");

    }

    public static void main(String agrs[]) {
        Student gaurav = new Student();
        gaurav.display1();
        gaurav.display2();
        gaurav.age = 22;
        gaurav.roll_no = 233;

        System.out.println(gaurav.age);
        System.out.println(gaurav.roll_no);

    }
}
