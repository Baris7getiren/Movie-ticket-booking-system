package deneme2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketBooking[] bookings = new TicketBooking[100]; 
        int bookingCount = 0; 
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("Movie Ticket Booking System");
            System.out.println("1. Create new Ticket Booking");
            System.out.println("2. Display all Ticket Bookings");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {

              case 1: 
                    System.out.print("Enter movie name: ");
                    String movieName = scanner.nextLine();

                    System.out.print("Enter show date (YYYY-MM-DD): ");
                    String showDate = scanner.nextLine();

                    System.out.print("Enter show time (HH:MM): ");
                    String showTime = scanner.nextLine();

                    System.out.print("Enter ticket price: ");
                    int ticketPrice = scanner.nextInt();

                    System.out.print("Enter number of tickets: ");
                    int ticketCount = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Select seat type (Regular, Premium, VIP): ");
                    String seatTypeInput = scanner.nextLine();
                    TicketBooking.SeatType seatType = TicketBooking.SeatType.valueOf(seatTypeInput);

                    bookings[bookingCount] = new TicketBooking(movieName, showDate, showTime, ticketPrice, ticketCount, seatType);
                    bookingCount++;
                    System.out.println("Booking created successfully!");
                    break;

               case 2:
     
                   if (bookingCount == 0) {
                        System.out.println("No bookings available!");
                    } else {
                        System.out.println("Ticket Booking Information:");
                        for (int i = 0; i < bookingCount; i++) {
                            bookings[i].displayInfo();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

