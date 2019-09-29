package udemyAbstract;

public class Dog extends Animal {
    // super calls the constructor in animal class
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating");
    }

    @Override
    public void breath() {

        System.out.println("Breath in, breath out, repeat");

    }
}
