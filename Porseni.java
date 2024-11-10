import java.util.Scanner;
public class Porseni {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        int polytechnicCount = 0;
        
        do {
            polytechnicCount++;
            System.out.println("\nEnter information for Polytechnic #" + polytechnicCount);
            System.out.print("Enter Polytechnic name (or 'quit' to stop): ");
            String polytechnicName = sc.nextLine();
            
            if (polytechnicName.equalsIgnoreCase("quit")) {
                break;
            }
            
            System.out.println("\nAthletes from " + polytechnicName + ":");
            
            for (String sport : sports) {
                System.out.println("\n" + sport + " athletes:");
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Enter name of athlete #" + i + ": ");
                    String athleteName = sc.nextLine();
                    System.out.println(sport + " Athlete #" + i + ": " + athleteName);
                }
            }
            
        } while (true);
        
        System.out.println("\nThank you for entering the information.");
        sc.close();
    }
}
