import java.util.Locale;
import java.util.Scanner;
/*
*Write a program to read an array of N integers. Then, show on the screen the arithmetic average of only the even
*numbers read, with one decimal place. If no even number is entered, display the message "NO EVEN NUMBER"
* */


public class EvenAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        double evenAverage;
        double sumEvenNumbers = 0.0;

// getting the size of array
        System.out.print("Enter array size: ");
        arrayLength = scanner.nextInt();
        int[] arrayList = new int[arrayLength];

// getting array numbers
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter a number: ");
            arrayList[i] = scanner.nextInt();
        }

// getting even array numbers
        int[] evenNumber = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (arrayList[i] % 2 == 0) {
                evenNumber[i] = arrayList[i];
            }
        }

// getting even average
        for (int j : evenNumber) {
            sumEvenNumbers += j;
        }
        evenAverage = sumEvenNumbers / evenNumber.length;

// printing result
        if (evenAverage != 0) {
            System.out.printf("Even numbers average: %.1f%n", evenAverage);
        } else {
            System.out.println("No even number");
        }
    }
}