package PersonalPactice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLargestValue {
    
    public static void main(String[] args) {
        Integer[] arr = {33, 34, 112, 14, 23};
        
        //Convert array to List using asList() method 
      List b = Arrays.asList(arr);
    
        //Then call the max method of the Collections class which will return the maximum value in the list
        System.out.println(Collections.max(b));
    }
}

