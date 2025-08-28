import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hotel Seaside");
        System.out.println("Our menu => ");
        System.out.println("- Grilled Lobster Tail");
        System.out.println("- Garlic Butter Shrimp");
        System.out.println("- Pan-Seared Scallops");
        System.out.println("- Crab Cakes");
        System.out.println("- Baked Salmon with Lemon Herb Sauce");

        System.out.print("What would you like to order?");
        String order = sc.nextLine();

        switch (order) {
            case "Grilled Lobster Tail","Garlic Butter Shrimp","Pan-Seared Scallops","Crab Cakes","Baked Salmon with Lemon Herb Sauce" :
                System.out.print("How many dollars for each?");
                double Price =  sc.nextDouble();
                System.out.print("How many Plates?");
                int Plates = sc.nextInt();
                System.out.print("Your bill is "+ Price * Plates +"$");
                break;

            default :
                System.out.println("Please choose From our Menu");
                break;
        }
    }
}
