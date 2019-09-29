package udemyInheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal  = new Animal(1,1,5,20,"animal");
        Dog husky = new Dog(5,85,"Husky",2,2,1, 25,"fluffy");

//        husky.eat();
        husky.walk();
//        husky.run();
    }

}
