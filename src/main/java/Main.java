public class Main {
    public static void main(String[] args) {

        TaskSolver taskSolver = new TaskSolver();

        boolean isDivisibleByFiveAndSeven = taskSolver.isDivisibleByFiveAndSeven(35);
        System.out.println("Task 1: " + isDivisibleByFiveAndSeven);

        boolean inRange = taskSolver.isInRangeFrom10To20(15);
        System.out.println("Task 2: " + inRange);

        boolean isSquare = taskSolver.isSquare(4, 16);
        System.out.println("Task 3: " + isSquare);

        boolean isEndsIn5 = taskSolver.isEndsIn5(555);
        System.out.println("Task 4: " + isEndsIn5);

        boolean digitSumIsEven = taskSolver.digitSumIsEven(8);
        System.out.println("Task 5: " + digitSumIsEven);

        boolean areEqualsInModulus = taskSolver.areEqualInModulus(5, 5);
        System.out.println("Task 6: " + areEqualsInModulus);

        String x = taskSolver.isPositiveNegativeZero(0);
        System.out.println("Task 7: " + x);

        boolean isDivisible2Or3 = taskSolver.isDivisibleByTwoOrThree(36);
        System.out.println("Task 8: " + isDivisible2Or3);

        String evenOrOddSum = taskSolver.isSumEven(5, 5);
        System.out.println("Task 9: " + evenOrOddSum);

        boolean isDivisibleByFourAndSix = taskSolver.isDivisibleByFourAndSix(24);
        System.out.println("Task 10: " + isDivisibleByFourAndSix);

        String isEvenAndDivisibleByTen = taskSolver.isEvenAndDivisibleByTen(15, 15);
        System.out.println("Task 11: " + isEvenAndDivisibleByTen);

        int maxOfThreeNumbers = taskSolver.maxOfThreeNumbers(15, 1000000, 225000000);
        System.out.println("Task 12: " + maxOfThreeNumbers);

        boolean isNumberPalindrome = taskSolver.isNumberPalindrome(12345);
        System.out.println("Task 13: " + isNumberPalindrome);

        Integer areDivisibleByThree = taskSolver.areDivisibleByThree(41, 90);
        System.out.println(areDivisibleByThree);

        for (int i = 6; i <= 21; i += 3) {
            System.out.println(i + " " + taskSolver.ageCategory(i));
        }

        boolean isFirstDivisibleBySecondWithRemainderTwo = taskSolver.isFirstDivisibleBySecondWithRemainderTwo(18, 3);
        System.out.println(isFirstDivisibleBySecondWithRemainderTwo);
    }
}
