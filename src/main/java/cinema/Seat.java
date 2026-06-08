package cinema;

public class Seat{
    String seatId;
    int column;
    char row;

    public Seat(char row, int column){
        this.row = row;
        this.column = column;
        this.seatId = ""+row+column;
    }

    public String getId(){
        return this.seatId;
    }

    public char getRow(){
        return this.row;
    }

    public int getColumn(){
        return this.column;
    }

    @Override
    public String toString(){
        return "Row: " + getRow() + 
                " Seat: " + getColumn();
    }


}
