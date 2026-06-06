package cinema;
import java.time.Duration;

public class Main{
    public static void main(String[] args){
        
        // Generate movies
        Movie film1 = new Movie("Scary Movie", Duration.ofMinutes(94), Genre.COMEDY);
        Movie film2 = new Movie("Toy Story 5", Duration.ofMinutes(102), Genre.ANIMATION);
        Movie film3 = new Movie("Supergirl", Duration.ofMinutes(110), Genre.ACTION);


    }
}