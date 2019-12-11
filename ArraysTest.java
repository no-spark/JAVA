import java.util.Arrays;

public class ArraysTest{
    public static void main(String[]args){
        int[]arr={6,7,88,44,33,9};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,33));
    }
}