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
        return seatId;
    }

    public char getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    @Override
    public String toString(){
        return "Row: " + getRow() + 
                " Seat: " + getColumn();
    }


}
