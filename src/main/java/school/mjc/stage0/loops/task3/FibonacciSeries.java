package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int[] arr = new int[lastFibonacci];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < lastFibonacci; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
