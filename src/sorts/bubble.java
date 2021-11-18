package sorts;

import java.util.LinkedList;


public class bubble {
    
    public static void bubbleSort (LinkedList<Integer> number) {
        
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < number.size() - i - 1; j++) {

                if (number.get(j) > number.get(j + 1) ){
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
    
    
}
