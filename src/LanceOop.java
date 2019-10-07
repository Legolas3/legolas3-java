import java.util.Scanner;

public class LanceOop {
public static void main(String[] args) {
    //////Introduction to OOP //////



    Scanner sc = new Scanner(System.in);
    Thing thing =  new Thing();

    MyObject object = new MyObject();

    object.name = "Lancelot";
    object.number = 1;

    System.out.println("My name is " + object.name + " I'm number " + 1);
    object.test();

    thing.num = 5;
    thing.word = "hello";

    Thing thing2 = new Thing();

    thing2.word = "whatever";
    thing2.num = 21;

//    System.out.println(thing.num + thing2.num);

    thing.foo();

    thing2.foo();

    ///// Data structures ///////

    Employee emp = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();

    emp.name = "Jeff";
    emp.age = 32;
    emp.jobTitle ="Construction Worker";

    emp2.name = "Sara";
    emp2.age = 28;
    emp2.jobTitle = "School Teacher";

    emp3.name = "Lancelot";
    emp3.age = 41;
    emp3.jobTitle = "The most interesting man in world";

bar(emp3);
bar(emp);
bar(emp2);
}
static void bar(Employee emp){
//    System.out.println(emp.name + " is " + emp.age + " years old, and is " + emp.jobTitle + ".");

    //// State and behaviour //////



}

}
