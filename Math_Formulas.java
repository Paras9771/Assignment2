import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Math_Formulas {
    public static void main(String[] args) {
//        1. Power a of b
        double power = Math.pow(2,3);
        System.out.println("Power of value "+power);

//        2. Square root
        double sqrt = Math.sqrt(25);
        System.out.println("Square root of any value "+sqrt);

//        3.Absolute value
        double abs = Math.abs(-65);
        System.out.println("Absolute value "+abs);

//        4. Minimum value and Maximum Value
        int a = 50;
        int b = 100;
        System.out.println("Find Maxinum");
        System.out.println(Math.max(a,b));
        System.out.println("Find Minimum");
        System.out.println(Math.min(a,b));

//        5. Generate random number
        System.out.println("Generate random number");
        System.out.println(Math.random());

//        6. Rounding to Nearest Integer
        System.out.println("Find the nearest number to round of");
        System.out.println(Math.round(4.6));

//        7. Array sort
        int arr[] = {5,3,6,2,6,9,1,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        8. Reverse Array
        Integer arr1[] = {1,2,3,4,5,6,7};
        List<Integer>list1 = Arrays.asList(arr1);
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
