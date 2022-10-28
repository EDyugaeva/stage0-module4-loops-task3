package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result = 1;
        int max = Integer.MIN_VALUE;
        if (first > second) {
            max = first;
        }
        else {
            max = second;
        }

        for (int i = 1; i <= max; i++) {
            if (first % i == 0 && second % i == 0 && result < i) {
                result = i;
            }
        }

        System.out.println(result);
    }
}
