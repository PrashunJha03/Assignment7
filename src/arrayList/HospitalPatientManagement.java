package arrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HospitalPatientManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<String> patients = new LinkedList<>();

        int choice;

        do {

            System.out.println("\n===== HOSPITAL PATIENT MANAGEMENT =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Treat Patient");
            System.out.println("3. View Next Patient");
            System.out.println("4. Display Waiting Patients");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter patient name: ");
                String patient = sc.nextLine();

                patients.offer(patient);

                System.out.println("Patient added successfully.");

                break;


            case 2:

                if (patients.isEmpty()) {

                    System.out.println("No patients waiting.");

                } else {

                    String treatedPatient = patients.poll();

                    System.out.println("Treating patient: "
                            + treatedPatient);
                }

                break;


            case 3:

                if (patients.isEmpty()) {

                    System.out.println("No patients waiting.");

                } else {

                    System.out.println("Next patient: "
                            + patients.peek());
                }

                break;


            case 4:

                if (patients.isEmpty()) {

                    System.out.println("No patients waiting.");

                } else {

                    System.out.println("\n===== WAITING PATIENTS =====");

                    for (String p : patients) {

                        System.out.println(p);
                    }
                }

                break;


            case 5:

                System.out.println("Exiting program...");

                break;


            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}