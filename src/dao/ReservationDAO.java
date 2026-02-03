package dao;

import java.util.List;

import dto.Reservation;

public interface ReservationDAO {

    boolean addReservation(Reservation reservation);

    List<Reservation> getAllReservations();

    Reservation getReservationById(int id);

    boolean cancelReservation(int id);
}
