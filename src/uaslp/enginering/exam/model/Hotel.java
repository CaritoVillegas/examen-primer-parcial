package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> room;
    private String name;
    private int pool;
    private int gym;

    public Hotel(String name) {
        reservations = new ArrayList<>();
        room=new ArrayList<>();
        this.name=name;
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getName() {
        return (name);
    }

    public void addRoom(Room room) {
        this.room.add(room);
    }

    public ArrayList<Room> getRooms() {
        return (room);
    }

    public void setPool(int pool)
    {
        this.pool=pool;
    }
    public int getPool(){
        return pool;
    }

    public void setGym(int gym)
    {
        this.gym=gym;
    }
    public int getGym(){
        return gym;
    }
}
