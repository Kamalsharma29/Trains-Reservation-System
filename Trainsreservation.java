import java.util.Scanner;

public class Trainsreservation{
    //declaring static global variables
    static int seats[] = new int[11];
    static Scanner sc = new Scanner(System.in);

    //creating main
    public static void main(String[] args) {
        System.out.println("Welcome to xyz trains");
        //while loop to display option till the exit is called
        while (true) {
            System.out.println("Please select an option: ");
            System.out.println("1. View available seats");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            //use of switch case for performing operation of users's prefered choice
            switch (choice) {
                case 1://display seat
                    displaySeats();
                    break;
                case 2://reserve seat
                    reserveSeat();
                    break;
                case 3:
                    System.out.println("Thank you for using XYZ trains");
                    System.exit(0);
            } //end of switch case
        } //end of while loop
    } //end of main method

    //declaring method displaySeats() for display avaliable and reserved seats
    public static void displaySeats() {
        System.out.println("Seats:");
        for (int i = 1; i <= 10; i++) {
            //use of ternary operator to print if the seats are avalible or not
            System.out.println("Seat " + i + ": " + (seats[i] == 0 ? "Available" : "Reserved"));
        }
    } //end of displayseats()

    //declaring method reserveSeat()
    public static void reserveSeat() {
        System.out.println("Enter seat number to reserve: ");
        int seat = sc.nextInt();
        //if checks if the seat is avaliable or not and if the the seat is avaliable it reserves the seat else the seat will be not reserved
        if (seats[seat] == 0) {
            seats[seat] = 1;
            System.out.println("Seat " + seat + " reserved successfully");
        } else {
            System.out.println("Seat " + seat + " is already reserved");
        }
    }
}