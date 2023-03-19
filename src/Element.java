//java Program to print the elements of an array
import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(" Enter the Number");
            int a = sc.nextInt();
            arr[i] = a;

        }

        for (int j = 1; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
        }
    }
}





