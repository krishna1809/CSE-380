import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
       
        int N = scanner.nextInt();

        if (N < 5 || N > 15) {
            System.out.println("Invalid ");
            return;
        }

     
       
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

   
       
        int choice = scanner.nextInt();

   
        if (choice == 1) {
            Arrays.sort(array);
        } else if (choice == 2) {
            Arrays.sort(array);
            reverseArray(array);
        } else {
            System.out.println("Invalid ");
            return;
        }

      
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }

      
        
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
    }

  
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            
            start++;
            end--;
        }
    }
}