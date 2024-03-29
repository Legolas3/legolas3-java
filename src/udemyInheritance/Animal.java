package udemyInheritance;

public class Animal {
    // animal characteristics
    private int brain;
    private int body;
    private  int size;
    private int weight;
    private String name;

    // animal characteristics intitialized
    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;


    }

    public void eat(){
        System.out.println("animal.eat() called");

    }

    public void move(int speed){
        System.out.println("animal.move() called. animal moving at : " + speed);
    }


    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
