import static java.lang.Math.abs;

public class TaskSolver {
/*
Задача 1: Проверка делимости на 5 и 7
Напишите функцию, которая принимает целое число и возвращает true, если оно делится
на 5 и на 7 одновременно, и false в противном случае.
*/
    public boolean isDivisibleByFiveAndSeven(int number) {
        return number % 5 == 0 && number % 7 == 0;
    }

/*
Задача 2: Определение принадлежности числа интервалу
Создайте функцию, которая принимает число и проверяет, входит ли оно в интервал от 10 до 20 включительно.
Если число попадает в интервал, верните true, иначе — false.
*/
    public boolean isInRangeFrom10To20(int number) {
        return number >= 10 && number <= 20;
    }

/*
 * Задача 3: Проверка на квадрат числа
 * Напишите функцию, которая принимает два числа и возвращает true, если одно из чисел
 * является квадратом другого, и false в противном случае.
 */
    public boolean isSquare(int a, int b) {
        return a * a == b;
    }

/*
 Задача 4: Проверка последней цифры
 Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5.
 Верните true, если заканчивается, и false, если нет.
*/
    public boolean isEndsIn5(int sum_number) {
        return sum_number % 10 == 5;
    }

/*
   Задача 5: Проверка, является ли сумма цифр четной
   Реализуйте функцию, которая принимает число, суммирует его цифры и возвращает true, если сумма четная,
   и false, если нечетная.
*/
    public boolean digitSumIsEven(int number) {
        int digitsSum = 0;
        while (number != 0) {
            digitsSum += number % 10;
            number = number / 10;
        }
        return digitsSum % 2 == 0;
    }

/*
 Задача 6: Сравнение двух чисел по модулю
 Напишите функцию, которая принимает два числа и возвращает true, если модули чисел равны,
 и false в противном случае.
*/
    public boolean areEqualInModulus(int a, int b) {
        return abs(a) == abs(b);
    }

/*
    Задача 7: Проверка знака числа
    Создайте функцию, которая принимает число и возвращает "Positive", если оно положительное,
    "Negative", если оно отрицательное, и "Zero", если оно равно нулю.
*/
    public String isPositiveNegativeZero(int k) {
        if (k == 0) {
            return "Zero";
        } else if (k < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }
/*
    Задача 8: Проверка делимости на 2 или 3
    Напишите функцию, которая принимает число и возвращает true, если оно делится на 2 или на 3,
    и false в противном случае.
 */
    public boolean isDivisibleByTwoOrThree(int number8) {
        return number8 % 2 == 0 || number8 % 3 == 0;
    }

/*
    Задача 9: Четность суммы двух чисел
    Создайте функцию, которая принимает два числа и возвращает
    "Even", если сумма чисел четная, и "Odd", если нечетная
 */
    public String isSumEven(int number1, int number2) {
        if ((number1 + number2) % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

/*
    Задача 10: Определение числа, кратного и 4, и 6
    Создайте функцию, которая проверяет, делится ли число на 4 и на 6 одновременно.
    Верните true, если да, и false, если нет.
 */
    public boolean isDivisibleByFourAndSix(int number10) {
        return number10 % 4 == 0 && number10 % 6 == 0;
    }

/*
    Задача 11: Проверка суммы на четность и кратность 10
    Реализуйте функцию, которая принимает два числа и возвращает
    "Even and Divisible by 10", если их сумма четная и делится на 10,
    "Even but not Divisible by 10", если сумма четная, но не делится на 10,
     и "Odd", если сумма нечетная.
 */
    public String isEvenAndDivisibleByTen(int m, int n) {
        if ((m + n) % 2 == 0 && (m + n) % 10 == 0) {
            return "Even and Divisible by 10";
        } else if ((m + n) % 2 == 0 && (m + n) % 10 != 0) {
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

/*
    Задача 12: Максимум трех чисел
    Напишите функцию, которая принимает три числа и возвращает наибольшее из них.
 */
    public int maxOfThreeNumbers(int a, int b, int c) {
        int maxNumber = a;
        if (b > maxNumber) maxNumber = b;
        if (c > maxNumber) maxNumber = c;
        return maxNumber;
    }

/*
    Задача 13: Проверка на палиндромность числа
    Создайте функцию, которая принимает целое число и проверяет, является ли оно палиндромом
    (например, 121 или 12321). Верните true, если да, и false, если нет.
 */
    public boolean isNumberPalindrome(int number13) {
        int reversedNumber = 0;
        int original = number13;
        while (number13 != 0) {
            int digit = number13 % 10;
            number13 = number13 / 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        return original == reversedNumber;
    }

/*
    Задача 14: Кратность чисел и их сумма
    Реализуйте функцию, которая принимает два числа. Если оба числа кратны 3, верните их сумму;
    если одно из них кратно 3, верните удвоенное значение второго числа; если ни одно не кратно 3,
    верните null.
 */
    public Integer areDivisibleByThree(int number1, int number2) {
        if (number1 % 3 == 0 && number2 % 3 == 0) {
            return number1 + number2;
        } else if (number1 % 3 == 0 || number2 % 3 == 0 ) {
            return 2 * (number1 % 3 == 0 ? number2 : number1);
        } else return null;
    }

/*
    Задача 15: Проверка возраста на категорию
    Напишите функцию, которая принимает возраст и возвращает категорию: Child (до 12 лет),
    Teenager (от 13 до 17 лет), Adult (от 18 до 64 лет) или Senior (от 65 лет и старше).
 */
    public String ageCategory(int age) {
        return age <= 12 ? "Child" : age <= 17 ? "Teenager" : age <= 64 ? "Adult" : "Senior";
    }

/*
    Задача 16: Проверка на делимость с остальным значением
    Создайте функцию, которая принимает два числа и проверяет, делится ли первое число на второе
    с остатком равным 2. Верните true, если делится с остатком 2, и false — если нет.
 */
    public boolean isFirstDivisibleBySecondWithRemainderTwo(int first, int second) {
        return first % second == 2;
    }
}
