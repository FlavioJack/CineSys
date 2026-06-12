package cinema;
import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket{
    String ticketId;
    LocalDateTime emissionDate;
    boolean validationStatus;
    float ticketPrice;
    Screening screening;
    Seat seat;

    public Ticket(float ticketPrice, Screening screening, Seat seat){
        this.ticketId = UUID.randomUUID().toString();
        this.emissionDate = LocalDateTime.now();
        this.ticketPrice = ticketPrice;
        this.screening = screening;
        this.seat = seat;
        this.validationStatus = false;
    }

    public Seat getSeat(){
        return seat;
    }

    public boolean getValidationStatus(){   
        return validationStatus;
    }
    public void setValidationStatus(boolean validationStatus){
        this.validationStatus = validationStatus;
    }

    @Override
    public String toString(){
        return "|| Ticket -- PNR: "+ticketId+
                ", emesso il "+emissionDate+
                ", prezzo: "+ticketPrice+"€"+
                ", film: "+screening.getMovie()+
                ", posto: "+seat.getId()+
                ", data e ora proiezione: "+screening.getDate()+
                " "+screening.getTime()+" ||";
    }

}