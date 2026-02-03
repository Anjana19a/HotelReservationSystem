package main;

import java.sql.Date;
import java.util.Scanner;

import dto.Reservation;
import service.ReservationService;

public class HotelReservationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReservationService service = new ReservationService();

        while (true) {
            System.out.println("\n--- HOTEL RESERVATION SYSTEM ---");
            System.out.println("1. Add Reservation");
            System.out.println("2. View All Reservations");
            System.out.println("3. Search Reservation");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Guest Name: ");
                    String name = sc.nextLine();
                    System.out.print("Room Type: ");
                    String room = sc.nextLine();
                    System.out.print("Check-in (yyyy-mm-dd): ");
                    Date in = Date.valueOf(sc.nextLine());
                    System.out.print("Check-out (yyyy-mm-dd): ");
                    Date out = Date.valueOf(sc.nextLine());

                    service.addReservation(new Reservation(name, room, in, out));
                    break;

                case 2:
                    service.viewAllReservations();
                    break;

                case 3:
                    System.out.print("Enter Reservation ID: ");
                    service.searchReservation(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Reservation ID: ");
                    service.cancelReservation(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Thank you for using system!");
                    System.exit(0);
                    sc.close();

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
