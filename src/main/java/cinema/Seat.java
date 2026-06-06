package cinema;

public class Seat{
    String seatId;
    String row;
    String column;

    public Seat(String seatId, String row, String column){
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

    public String getRow(){
        return this.row;
    }
    public void setRow(String row){
        this.row = row;
    }

    public String getColumn(){
        return this.column;
    }
    public void setColumn(String column){
        this.column = column;
    }

    public String toString(){
        return "Row " + getRow() + 
                ", Seat number " + getColumn() + ".";
    }


}