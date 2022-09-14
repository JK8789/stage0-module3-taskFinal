package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstDigitOfNumber = number / 1000;
        int secondDigitOfNumber = (number - firstDigitOfNumber * 1000) / 100;
        int thirdDigitOfNumber = (number - firstDigitOfNumber * 1000
                                             - secondDigitOfNumber * 100) / 10;
        int forthDigitOfNumber = number - firstDigitOfNumber * 1000
                                        - secondDigitOfNumber * 100
                                        - thirdDigitOfNumber * 10;
        System.out.println(firstDigitOfNumber + secondDigitOfNumber
                         + thirdDigitOfNumber + forthDigitOfNumber);
    }

    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(1234);
    }
}
