package cinema;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Screening{
    Movie movie;
    Hall hall;
    LocalDate screeningDate;
    LocalTime screeningTime;
    ArrayList<Ticket> soldTickets;

    public Screening(Movie movie, Hall hall, LocalDate screeningDate, LocalTime screeningTime){
        this.movie = movie;
        this.hall = hall;
        this.screeningDate = screeningDate;
        this.screeningTime = screeningTime;
        soldTickets = new ArrayList<>();
    }

    public Movie getMovie(){
        return movie;
    }
    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public Hall getHall(){
        return hall;
    }
    public void setHall(Hall hall){
        this.hall = hall;
    }

    public LocalDate getDate(){
        return screeningDate; 
    }
    public void setDate(LocalDate screeningDate){
        this.screeningDate = screeningDate;
    }

    public LocalTime getTime(){
        return screeningTime; 
    }
    public void setDate(LocalTime screeningTime){
        this.screeningTime = screeningTime;
    }

    public boolean isSeatAvailable(Seat seat){
        boolean available = false;
        for(Ticket t: soldTickets){
            String bookedSeatId = t.getSeat().getId();
            String bookingSeatId = seat.getId();
            if(bookedSeatId.compareTo(bookingSeatId) == 0) // compareTo generates a number, like strcmp() in C <, > or == 0
                available = false;
            if(!available)
                return available;
        }
        return available;
    }
    
}