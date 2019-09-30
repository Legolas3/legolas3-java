package udemyAbstract;
// abstract classes defines behaviors that are necessary without specifying how they are performed
// the sub-classes must implements behaviors(Methods)
// methods of an abstract class can have any visibility.  public, private, protected, etc.
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //abstract methods
    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
