package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean positiveNum = number > 0;
        System.out.println(positiveNum);
    }

    public static void main(String[] args) {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        numbersPrinter.printIsPositive(-1);
    }
}
