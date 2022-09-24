package Algoritm_24_09_22_lesson_2;

public class Fibonacci {

    // рекурсия это метод когда можно вызват функцию самой функции
    public static void main(String[] args) {
        System.out.println(fibNaive(4));
        System.out.println(fibNaive(3));
        System.out.println(fibNaive(0));


        System.out.println(FibEffect(6));
    }


    private static int fibNaive(int n){
        if (n <=1){
            return n;
        }else {
            return fibNaive(n-1)+fibNaive(n-2);
        }

    }

    private static long FibEffect(int n){// FibEffect
        long [] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
