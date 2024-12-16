import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import models.exceptions.DomainException;

public class hotelProgram3 {
    public static void main(String[] args) {
        // Scanner - SimpleDateFormat
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Inputs
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            // Create reservation
            Reservation1 reservation1 = new Reservation1(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation1);

            // Update Inputs
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation1.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation1);
        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch(RuntimeException e) {
            System.out.println("Unexpected error!");
        }

        sc.close();
    }
}
