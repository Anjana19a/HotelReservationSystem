package dto;

import java.sql.Date;

public class Reservation {

    private int reservationId;
    private String guestName;
    private String roomType;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {}

    public Reservation(String guestName, String roomType, Date checkIn, Date checkOut) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
