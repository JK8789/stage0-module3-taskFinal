package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        int firstDigit = number / 100;
        int secondDigit = (number-(firstDigit*100))/10;
        int thirdDigit = number - firstDigit * 100 - secondDigit * 10;
        int result = thirdDigit*100 + secondDigit*10 + firstDigit;
        System.out.println(result);
    }

    public static void main(String[] args) {
        revert(123);
    }
}
