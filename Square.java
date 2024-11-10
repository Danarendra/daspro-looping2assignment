import java.util.Scanner;
public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        
        do {
            System.out.print("Enter N (must be at least 3): ");
            N = sc.nextInt();
            if (N < 3) {
                System.out.println("N must be at least 3. Please try again.");
            }
        } while (N < 3);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N-1 || j == 0 || j == N-1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}