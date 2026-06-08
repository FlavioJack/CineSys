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

    public boolean getValidationStatus(){   
        return this.validationStatus;
    }
    public void setValidationStatus(boolean validationStatus){
        this.validationStatus = validationStatus;
    }

    public String toString(){
        return "|| Ticket -- PNR: "+this.ticketId+
                ", emesso in data "+this.emissionDate+
                ", prezzo: "+this.ticketPrice+"€"+
                ", film: "+""+
                ", posto: "+seat.getId()+" ||";
    }

}