package arrayList;

import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> history = new Stack<>();

        int choice;

        do {

            System.out.println("\n===== BROWSER HISTORY =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. View Current Page");
            System.out.println("4. Display History");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter page name: ");
                String page = sc.nextLine();

                history.push(page);

                System.out.println("Page visited: " + page);

                break;


            case 2:

                if (history.isEmpty()) {

                    System.out.println("No previous page available.");

                } else {

                    String pageBack = history.pop();

                    System.out.println("Going back from: " + pageBack);

                    if (!history.isEmpty()) {

                        System.out.println("Current page: "
                                + history.peek());

                    } else {

                        System.out.println("No page available.");
                    }
                }

                break;


            case 3:

                if (history.isEmpty()) {

                    System.out.println("No page is currently open.");

                } else {

                    System.out.println("Current page: "
                            + history.peek());
                }

                break;


            case 4:

                if (history.isEmpty()) {

                    System.out.println("History is empty.");

                } else {

                    System.out.println("\n===== BROWSER HISTORY =====");

                    for (String p : history) {

                        System.out.println(p);
                    }
                }

                break;


            case 5:

                System.out.println("Exiting Browser History...");

                break;


            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}