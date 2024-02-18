import java.util.Scanner;

//Name: James Dams
//ID: 5510919

public class testQuestion {
    public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            for (int i = 0 ; i < 1000 ; i++) {
                long a = scan.nextLong();
                long b = scan.nextLong();
                System.out.println(a + b);
            }
            scan.close();
    }
}