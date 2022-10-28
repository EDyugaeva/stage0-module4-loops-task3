package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
//        System.out.println(lengthOfLastNumber);
        int sum = 0;
        int number = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            number = number + 9 * ((int) Math.pow(10, i));
            sum = sum + number;
//            System.out.println("number = " + number);
        }
        System.out.println(sum);
    }
}
