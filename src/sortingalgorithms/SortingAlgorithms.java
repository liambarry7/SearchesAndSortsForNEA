
package sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import sorts.*;

public class SortingAlgorithms {

    
    public static Random rand = new Random();
    
    public static void main(String[] args) {
        
        leg();
        
        
        int[] listNumbers = new int[10];
        for (int i = 0; i < listNumbers.length; i++) {
            int a = rand.nextInt((25-1)+1)+1;
            listNumbers[i] = a;
        }
        
        for (int i = 0; i < listNumbers.length; i++) {
            System.out.print(listNumbers[i] + " ");
        }
        
        bubbleSort(listNumbers);
        
        for (int i = 0; i < listNumbers.length; i++) {
            System.out.print(listNumbers[i] + " ");
        }
        
//        LinkedList<Integer> number = new LinkedList<Integer>();
//        
//        //ArrayList<Integer> number = new ArrayList<Integer>();
//        fillList(number);
//        System.out.println(number);
//        System.out.println(number.size());
//        bubble.bubbleSort(number);
//        //bubbleSort(number);
    }
    
    public static void fillList(LinkedList<Integer> number) {
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt((25-1)+1)+1;
            number.add(a);
        }
    }
    
    public static void bubbleSort (int[] number) {
       
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length - i -  1; j++) {

                if (number[j] > number[j + 1] ){
                    //System.out.println(number.get(j));
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                } else {
                    System.out.print("");
                }

            }
        }
        
        //System.out.println(Arrays.toString(number));
        
    }

public static void leg(){
            System.out.println("milk");
            
}


}
