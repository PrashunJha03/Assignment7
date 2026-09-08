package arrayList;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainPassengerManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> passengers = new LinkedList<>();

        int choice;

        do {

            System.out.println("\n===== TRAIN PASSENGER MANAGEMENT =====");
            System.out.println("1. Add Passenger at Beginning");
            System.out.println("2. Add Passenger at End");
            System.out.println("3. Remove First Passenger");
            System.out.println("4. Remove Last Passenger");
            System.out.println("5. Search Passenger");
            System.out.println("6. Display Passengers");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter passenger name: ");
                String firstPassenger = sc.nextLine();

                passengers.addFirst(firstPassenger);

                System.out.println("Passenger added at beginning.");

                break;


            case 2:

                System.out.print("Enter passenger name: ");
                String lastPassenger = sc.nextLine();

                passengers.addLast(lastPassenger);

                System.out.println("Passenger added at end.");

                break;


            case 3:

                if (passengers.isEmpty()) {

                    System.out.println("No passengers available.");

                } else {

                    String removedFirst = passengers.removeFirst();

                    System.out.println("Removed passenger: "
                            + removedFirst);
                }

                break;


            case 4:

                if (passengers.isEmpty()) {

                    System.out.println("No passengers available.");

                } else {

                    String removedLast = passengers.removeLast();

                    System.out.println("Removed passenger: "
                            + removedLast);
                }

                break;


            case 5:

                System.out.print("Enter passenger name to search: ");
                String searchPassenger = sc.nextLine();

                if (passengers.contains(searchPassenger)) {

                    System.out.println("Passenger found.");

                } else {

                    System.out.println("Passenger not found.");
                }

                break;


            case 6:

                if (passengers.isEmpty()) {

                    System.out.println("No passengers available.");

                } else {

                    System.out.println("\n===== PASSENGERS =====");

                    for (String passenger : passengers) {

                        System.out.println(passenger);
                    }
                }

                break;


            case 7:

                System.out.println("Exiting program...");

                break;


            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}