package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String str = String.valueOf(t);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = (int) (t / (Math.pow(10, str.length() - i - 1)));
            int res = Math.abs(temp % 10);
            sum = (sum + res);
        }
        System.out.println(sum);

    }
}
