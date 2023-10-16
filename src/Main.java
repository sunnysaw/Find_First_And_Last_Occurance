/*
Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:
2 5
Explanation:
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
 */

import java.util.Scanner;
public class Main {
    static void  FirstAndLastOccurance(int[] array){
        int length = array.length;
        int count = 0;
        int[] duplicateArray = new int[2];
        for (int start = 0; start < length - 1; start++){
            if (count == 0){
                if (array[start] == array[start + 1]){
                    count++;
                    duplicateArray[0] = start;
                }
            }
            if (array[start] == array[start + 1]){
                    count++;
                    duplicateArray[1] = start + 1;
            }
        }
        System.out.println(duplicateArray[0] + " " + duplicateArray[1]);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
       FirstAndLastOccurance(array);
    }
}