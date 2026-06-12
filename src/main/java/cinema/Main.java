package cinema;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main{
    public static void main(String[] args){
        
        // Generate movies
        Movie film1 = new Movie("Scary Movie", Duration.ofMinutes(94), Genre.COMEDY);
        Movie film2 = new Movie("Toy Story 5", Duration.ofMinutes(102), Genre.ANIMATION);
        Movie film3 = new Movie("Supergirl", Duration.ofMinutes(110), Genre.ACTION);

        
        Hall hall1 = new Hall(1, 5, 5);
        hall1.showSeats();

        Seat s1 = new Seat('A', 1);

        Catalog cat = new Catalog();
        cat.addMovie(film1);
        cat.addMovie(film2);
        cat.addMovie(film3);
        System.out.println(cat);

        Screening screen1 = new Screening(film1, hall1, LocalDate.of(2026, 06, 12), LocalTime.of(21, 55));
        
        Ticket t1 = new Ticket(12.50f, screen1, s1);
        System.out.println(t1);



        
    }
}