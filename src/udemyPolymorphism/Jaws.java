package udemyPolymorphism;

public class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats a bunch of people";
    }
}

