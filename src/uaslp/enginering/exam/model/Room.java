package uaslp.enginering.exam.model;

public class Room {
    private int num;
    private String type;
    private RoomStatus rS;
    public Room(int num, String type, RoomStatus rS){
         this.num=num;
         this.type=type;
         this.rS=rS;
     }

    public int getNumber() {
        return (num);
    }

    public RoomStatus getStatus() {
        return (rS);
    }

    public String getType(){
        return type;
    }
}
