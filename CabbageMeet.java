import java.util.Scanner;
import java.util.ArrayList;

//Name: James Dams
//ID: 5510919

public class CabbageMeet {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> availableStaff = new ArrayList<>();
        int count = 0;
        for (int i = 0 ; i < 1000 ; i++) { //do for the 1000 inputs
            int[] availableArray = new int[30];
            availableStaff.clear();
            int n = scan.nextInt();
            scan.nextLine();
            for (int j = 0 ; j < n ; j++) { //do for the number of lines n
                //Scans the string then goes through characteer by character, adding the days in which a member of staff is available to an array . The array is full of numbers from 0 - 30 at this point
                String days = scan.nextLine();
                char[] daysInChar = days.toCharArray();
                for (char day : daysInChar) {
                    if (day == 'X') {
                        availableArray[count]++;
                    }
                    count++;
                }
                count = 0;
            }
            //Finds the highest value within the array
            int max = 0;
            for (int x : availableArray) {
                if (max < x) {
                    max = x;
                }
            }
            //Prints the indexes with the highest value within the array (which will be equal to the days with the maximum number of staff available)
            for (int k = 0 ; k < 30 ; k++) {
                if (availableArray[k] == max) {
                    System.out.print((k + 1) + " ");
                }
            }
            System.out.println("");
        }
        scan.close();
    }
}          