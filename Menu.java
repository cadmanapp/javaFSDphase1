package code;

public class Menu {
    public static void printMainMenu() {
        System.out.println("Welcome to MaXX 1.0");
        System.out.println("Developed by Gilbert C.");
        System.out.println("Jan 2023");
        System.out.println();
        System.out.println("Please select any of the options below to continue.");
        System.out.println("0. Close the MaXX:");
        System.out.println("1. List files:");
        System.out.println("2. File actions:");
        System.out.println();
        System.out.print("Enter your choice: ");
    }

    public static void printActionMenu() {
    	System.out.println("Please select any of the options below to continue");
    	System.out.println();
    	System.out.println("3. Add a file");
    	System.out.println("4. Delete a file");
    	System.out.println("5. Search for a file");
    	System.out.println("99. Return to main menu");
    	System.out.println();
        System.out.print("Select Action: ");
    }
}
