package service;

import dao.ReservationDAO;
import dao.ReservationDAOImpl;
import dto.Reservation;

import java.util.List;

public class ReservationService {

    ReservationDAO dao = new ReservationDAOImpl();

    public void addReservation(Reservation r) {
        if (dao.addReservation(r))
            System.out.println("Reservation added successfully!");
        else
            System.out.println("Failed to add reservation.");
    }

    public void viewAllReservations() {
        List<Reservation> list = dao.getAllReservations();
        for (Reservation r : list) {
            System.out.println(
                r.getReservationId() + " | " +
                r.getGuestName() + " | " +
                r.getRoomType() + " | " +
                r.getCheckIn() + " | " +
                r.getCheckOut()
            );
        }
    }

    public void searchReservation(int id) {
        Reservation r = dao.getReservationById(id);
        if (r != null)
            System.out.println(r.getGuestName() + " booked " + r.getRoomType());
        else
            System.out.println("Reservation not found.");
    }

    public void cancelReservation(int id) {
        if (dao.cancelReservation(id))
            System.out.println("Reservation cancelled.");
        else
            System.out.println("Invalid reservation ID.");
    }
}
