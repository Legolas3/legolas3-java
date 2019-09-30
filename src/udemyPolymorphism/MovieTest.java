package udemyPolymorphism;

public class MovieTest {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            // variable movie returned from randomMovie method
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                   // java looks at the variable movie and sees if it has a plot method().
                    // If it has a plot it goes into the class of tha movie and executes the plot method()
                    "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        // random number generator
        int randomNUmber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNUmber);
        // depend on whether the random number is between 1 and 5,
        // the switch statement will return the  movie associated with the random number
        switch (randomNUmber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

            // if the number is outside of the range of 1 through 5, it will return null.
            // it won't return null in this case based on how we've defined our random number.
            default:
                return null;
        }
    }
}
