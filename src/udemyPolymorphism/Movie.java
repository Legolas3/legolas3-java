package udemyPolymorphism;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // plot() method
    public String plot(){
        return " no plot here";
    }
}
