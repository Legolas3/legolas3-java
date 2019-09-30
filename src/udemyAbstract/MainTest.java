package udemyAbstract;

public class MainTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky ");
        dog.breath();
        dog.eat();

        Cardinal cardinal = new Cardinal("Red-crested cardinal");
        cardinal.eat();
        cardinal.breath();
        cardinal.fly();

        Penguin penguin = new Penguin("African penguin");
        penguin.fly();
    }
}
