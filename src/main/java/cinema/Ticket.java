package cinema;
import java.time.LocalDate;
import java.util.UUID;

public class Ticket{
    String ticketId;
    LocalDate emissionDate;
    boolean validationStatus;
    float ticketPrice;
    Screening screening;
    Seat seat;

    public Ticket(float ticketPrice, Screening screening, Seat seat){
        this.ticketId = UUID.randomUUID().toString();
        this.emissionDate = LocalDate.now();
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
                ", emesso in data "+emissionDate+
                ", prezzo: "+ticketPrice+"€"+
                ", film: "+""+
                ", posto: "+seat.getId()+" ||";
    }

}