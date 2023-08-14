import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to the Online Reservation System!");
        System.out.print("Enter your login id: ");
        String loginId = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Please fill in the following details to make a reservation:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter the date of journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter the starting station: ");
        String startingStation = scanner.nextLine();
        System.out.print("Enter the destination station: ");
        String destinationStation = scanner.nextLine();

      
        insertReservationData(loginId, name, trainNumber, classType, dateOfJourney, startingStation, destinationStation);

        
        System.out.print("Enter your PNR number to cancel your reservation: ");
        String pnrNumber = scanner.nextLine();
        if (confirmCancellation(pnrNumber)) {
            System.out.println("Your reservation has been cancelled.");
        } else {
            System.out.println("Cancellation failed.");
        }

        scanner.close();
    }

    
    private static void insertReservationData(String loginId, String name, int trainNumber, String classType, String dateOfJourney, String startingStation, String destinationStation) {
        
        System.out.println("Reservation details:");
        System.out.println("Login ID: " + loginId);
        System.out.println("Name: " + name);
        System.out.println("Train number: " + trainNumber);
        System.out.println("Class type: " + classType);
        System.out.println("Date of journey: " + dateOfJourney);
        System.out.println("Starting station: " + startingStation);
        System.out.println("Destination station: " + destinationStation);
    }

    private static boolean confirmCancellation(String pnrNumber) {
       
        return true;
    }
}
