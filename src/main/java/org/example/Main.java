package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Substring Exercise");
        System.out.println("Enter a string:");
        String originalString = scanner.nextLine();
        System.out.println("Enter beginning index:");
        String beginIndexString = scanner.nextLine();
        int beginIndex = Integer.parseInt(beginIndexString); 
        System.out.println("Enter ending index:");
        String endIndexString = scanner.nextLine();
        int endIndex = Integer.parseInt(endIndexString); 
        String subString = originalString.substring(beginIndex, endIndex);
        System.out.println("\nOriginal string:");
        System.out.println(originalString);
        System.out.println("\nSubstring:");
        System.out.println(subString);
        System.out.println("\nRun of Integers Exercise");
        System.out.println("Enter Start:");
        String startString = scanner.nextLine();
        int start = Integer.parseInt(startString); 
        System.out.println("Enter End:");
        String endString = scanner.nextLine();
        int end = Integer.parseInt(endString); 
        System.out.println(); 
        for (int i = start; i <= end; i++) { 
            System.out.println(String.valueOf(i)); 
        }
        System.out.println("\nSum of a Range of Sequential Integers Exercise");
        System.out.println("Enter low:");
        String lowString = scanner.nextLine();
        int low = Integer.parseInt(lowString); 
        System.out.println("Enter high:");
        String highString = scanner.nextLine();
        int high = Integer.parseInt(highString);
        long sumHigh = (long) high * (high + 1) / 2; 
        long sumLowMinus1 = (long) (low - 1) * (low - 1 + 1) / 2;
        long totalSum = sumHigh - sumLowMinus1;
        System.out.println("Sum = " + String.valueOf(totalSum));
        System.out.println("\nRepeatedly Echo a Word Exercise");
        System.out.println("Enter a word:");
        String wordToEcho = scanner.nextLine();
        int timesToEcho = wordToEcho.length(); 
        System.out.println(); 
        for (int i = 0; i < timesToEcho; i++) { 
            System.out.println(wordToEcho);
        }
        System.out.println("\nWords Separated by Dots Exercise");
        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();
        int totalLength = 30;
        int wordsLength = firstWord.length() + secondWord.length(); 
        int numberOfDots = totalLength - wordsLength; 
        System.out.print(firstWord);
        for (int i = 0; i < numberOfDots; i++) { 
            System.out.print(".");
        }
        System.out.println(secondWord);
        System.out.println("\nAdding up Integers Exercise");
        System.out.println("How many integers will be added:");
        String countString = scanner.nextLine();
        int count = Integer.parseInt(countString); 
        long sum = 0;
        for (int i = 0; i < count; i++) { 
            System.out.println("Enter an integer:");
            String integerString = scanner.nextLine();
            int number = Integer.parseInt(integerString); 
            sum += number; 
        }
        System.out.println("\nThe sum is " + String.valueOf(sum)); 
        System.out.println("\nShipping Cost Calculator Exercise");
        while (true) {
            System.out.println("Weight of Order:");
            String weightString = scanner.nextLine();
            double weight = Double.parseDouble(weightString); 
            if (weight <= 0) {
                System.out.println("bye");
                break; 
            }
            double shippingCost = 3.00; 
            if (weight > 10) {
                shippingCost += (weight - 10) * 0.25; 
            }
            String formattedCost = String.format("$%.2f", shippingCost);
            System.out.println("Shipping Cost: " + formattedCost);
            System.out.println(); 
        }
        scanner.close(); 
    }
}