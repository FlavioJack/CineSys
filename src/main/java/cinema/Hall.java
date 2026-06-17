package cinema;
import java.util.ArrayList;

public class Hall{
    int hallNumber;
    int capacity;
    private final ArrayList<Seat> seats;

    public Hall(int hallNumber, int rows, int columns){
        this.hallNumber = hallNumber;
        this.capacity = rows*columns;
        
        seats = new ArrayList<>();
        for(int i=0; i<rows; i++){
            char r = (char)(i+65); 
            for(int j=1; j<=columns; j++){
                seats.add(new Seat(r, j)); // 65 to 90 of ascii
            }
        }
    }

    public int getHallNumber(){
        return hallNumber;
    }
    public void setHallNumber(int hallNumber){
        this.hallNumber = hallNumber;
    }

    public int getCapacity(){
        return capacity;
    }

    public ArrayList<Seat> getSeatMap(){
        return seats;
    }

    public void showSeats(){
        System.out.println("Hall seats list");
        for(Seat s: seats)
            System.out.println(s);
    }

}