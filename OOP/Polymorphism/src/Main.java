public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int sum1 = myCalculator.add(4,6);
        System.out.println("Sum in the first method equals : " + sum1);

        int sum2 = myCalculator.add(4,5,7);
        System.out.println("Sum in the second method equals : " + sum2);

        double sum3 = myCalculator.add(8.9, 9.7);
        System.out.println("Sum in the Third method equals : " + sum3);


    }
}