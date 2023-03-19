import java.util.Scanner;

//java Program to print the largest element in an array
public class Largest {
    public static void main(String[] args) {
        int [] arr =new int[5];// array declaration
        //add element
        Scanner sc =new Scanner(System.in);
        for ( int i=1; i<arr.length; i++)
        {
            System.out.println("Enter the value");
            int a=sc.nextInt();
            arr[i]=a;

        }
        for ( int j=1; j< arr.length; j++)
        {
            System.out.println(arr[j]);
        }
        int b=arr[1];
        for (int k=2; k<arr.length; k++)
        {
            if(b<arr[k])
            {
                b=arr[k];
            }
        }
        System.out.println("maximum value is :- " +b);
    }
}
