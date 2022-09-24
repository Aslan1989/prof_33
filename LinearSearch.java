package Algoritm_24_09_22_lesson_2;

public class LinearSearch {
    public static void main(String[] args) {

        int [] a = new int[]{10,20,30,40,50,60,70,80,90,10,11,12,13,14,15,15,16,16,17,19,20};
        System.out.println(linearSearch(a,20));
    }


    public static int linearSearch(int arr[], int b){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b)
                return i;
        }
        return -1;
    }
}
