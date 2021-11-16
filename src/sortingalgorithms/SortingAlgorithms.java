
package sortingalgorithms;

import java.util.ArrayList;
import java.util.Random;
import sorts.*;

public class SortingAlgorithms {

    
    public static Random rand = new Random();
    
    public static void main(String[] args) {
        leg();
        ArrayList<Integer> number = new ArrayList<Integer>();
        fillList(number);
        System.out.println(number);
        System.out.println(number.size());
        
        bubbleSort(number);
    }
    
    public static void fillList(ArrayList<Integer> number) {
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt((25-1)+1)+1;
            number.add(a);
        }
    }
    
    public static void bubbleSort (ArrayList<Integer> number) {
       
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < number.size() - i -  1; j++) {

                if (number.get(j) > number.get(j + 1) ){
                    //System.out.println(number.get(j));
                    int temp = number.get(j);
                    number.set(number.get(j), number.get(j + 1));
                    number.set(number.get(j + 1), temp);
                } else {
                    System.out.print("");
                }

            }
        }
        
        System.out.println(number.toString());
        
    }

public static void leg(){
            System.out.println("milk");
            
}


}
