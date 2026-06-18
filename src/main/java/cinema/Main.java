package cinema;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        // Generate movies
        Movie film1 = new Movie("Scary Movie", Duration.ofMinutes(94), Genre.COMEDY);
        Movie film2 = new Movie("Toy Story 5", Duration.ofMinutes(102), Genre.ANIMATION);
        Movie film3 = new Movie("Supergirl", Duration.ofMinutes(110), Genre.ACTION);
        // Generate halls
        Hall hall1 = new Hall(1, 5, 5);
        Hall hall2 = new Hall(2, 7, 5);
        Hall hall3 = new Hall(3, 6, 5);
        // Generate and fill catalog
        Catalog catalog = new Catalog();
        catalog.addMovie(film1);
        catalog.addMovie(film2);
        catalog.addMovie(film3);
        // Generate and add screenings
        ArrayList<Screening> schedule = new ArrayList<>();
        Screening screen1 = new Screening(film1, hall1, LocalDate.of(2026, 06, 14), LocalTime.of(9, 10));
        Screening screen2 = new Screening(film1, hall1, LocalDate.of(2026, 06, 14), LocalTime.of(15, 20));
        Screening screen3 = new Screening(film1, hall1, LocalDate.of(2026, 06, 14), LocalTime.of(18, 35));
        Screening screen4 = new Screening(film1, hall1, LocalDate.of(2026, 06, 14), LocalTime.of(21, 55));
        schedule.add(screen1);
        schedule.add(screen2);
        schedule.add(screen3);
        schedule.add(screen4);


        // UI
        boolean exitVar = true;
        while (exitVar) { 
            System.out.println("1. Visualizza catalogo film");
            System.out.println("2. Visualizza le Proiezioni di oggi");
            System.out.println("3. Acquista biglietto");
            System.out.println("4. Esci");

            Scanner input = new Scanner(System.in);
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> System.out.println(catalog);
                case 2 -> { 
                    for(Screening s: schedule){
                        System.out.println(s);
                    }
                }
                case 3 -> {
                    System.out.print("Scegli una proiezione: ");
                    int chosenScreening = Integer.parseInt(input.nextLine());
                    Screening myScreening = schedule.get(chosenScreening-1);
                    // Manage seat
                    System.out.println(myScreening.getHall().showSeats());
                    System.out.print("Scegli una posto: ");
                    int chosenSeat = Integer.parseInt(input.nextLine());
                    Seat mySeat = myScreening.getHall().getSeatMap().get(chosenSeat);
                    if (myScreening.isSeatAvailable(mySeat)){
                        //Ticket t = new Ticket(,,);
                    }
                    else System.out.println("Posto già prenotato");
                    
                }
                case 4 -> exitVar = false;
                default -> throw new AssertionError();
            }

        }
        
        
        
    }
}