import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot lot = new ParkingLot(5); // Set 5 slots for example

        while (true) {
            System.out.println("\n--- Smart Parking System ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Parking Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String num = sc.nextLine();
                    System.out.print("Enter Owner Name: ");
                    String owner = sc.nextLine();
                    Vehicle v = new Vehicle(num, owner);
                    if (lot.parkVehicle(v)) {
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking Lot Full!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number to Remove: ");
                    String removeNum = sc.nextLine();
                    if (lot.removeVehicle(removeNum)) {
                        System.out.println("Vehicle removed successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                case 3:
                    lot.displayStatus();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
