package Algoritm_24_09_22_lesson_2;

public class NOD {
    public static void main(String[] args) {
        System.out.println(gcd(55,44));
    }
    public static int gcd(int a, int b){
        while (b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;

    }
}
