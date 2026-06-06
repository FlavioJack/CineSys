package cinema;

public class Seat{
    String seatId;
    int column;
    char row;

    public Seat(String seatId, char row, int column){
        this.seatId = seatId;
        this.row = row;
        this.column = column;
    }

    public String getId(){
        return this.seatId;
    }
    public void setId(String id){
        this.seatId = id;
    }

    public char getRow(){
        return this.row;
    }
    public void setRow(char row){
        this.row = row;
    }

    public int getColumn(){
        return this.column;
    }
    public void setColumn(int column){
        this.column = column;
    }

    public String toString(){
        return "Row: " + getRow() + 
                " Seat: " + getColumn();
    }


}
