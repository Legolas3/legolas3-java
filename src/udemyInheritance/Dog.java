package udemyInheritance;

public class Dog extends Animal {
    // dog characteristics
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);

        this. eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("dog.chew() called");
    }

    public void walk(){
        System.out.println("dog.walk called");
         super.move(5);
    }

    public void run(){
        System.out.println("dog.run() called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("dog.moveLegs() called");

    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
       moveLegs(speed);
        super.move(speed);
    }
}
