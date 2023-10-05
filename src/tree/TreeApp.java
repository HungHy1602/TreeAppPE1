/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Code and compile Listing 8.1 (page 406).
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {

    public static void main(String[] args) throws IOException {
        int value;
        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);

        String exitName = "LC_HUNG"; // Define the exit name

        while (true) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("                   TreeApp By LC_HUNG");
        System.out.println("-----------------------------------------------------------");
            System.out.print("Enter first letter of show, insert, find, delete, or traverse (or '" + exitName + "' to exit): ");
            String choice = getString();

            if (choice.equalsIgnoreCase(exitName)) {
                System.out.println("Exiting the program.");
                break;
            }

            switch (choice) {
                case "s":
                    theTree.displayTree();
                    break;
                case "i":
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(value, value + 0.9);
                    break;
                case "f":
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.println();
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                case "d":
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                case "t":
                    System.out.print("Enter type 1, 2, or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry");
            } // end switch
        } // end while
    } // end main()

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
