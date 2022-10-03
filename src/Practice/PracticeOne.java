package Practice;

import java.util.Scanner;

public class PracticeOne {
    /**
     * Задание №1 "Создать программу, которая выводит в консоль текст «Hello, World!» 3 раза".
     * 1. Создать новый класс PracticeOne.
     * 2. В созданном классе объявить метод main().
     * 3. В методе main() написать код, который выводит фразу "Hello, world!" три раза.
     * РЕЗУЛЬТАТ:
     * Hello, world!
     * Hello, world!
     * Hello, world!
     * <p>
     * Задание №2 "Написать программу, которая по трём числам a, b, c определяет, могут ли они быть
     * сторонами треугольника, и если да, то вид треугольника. Вывести результат в консоль".
     * (В треугольнике сумма длин двух его сторон больше длины третьей стороны. a < b + c и т.д.)
     * Подсказка: использую класс Scanner для ввода значений, условный опертаор if
     * и логические операторы для сравнения значения (здесь подойдет && - логическое И)
     * И помни, что результат любой логической операции true или false!
     * Результаты выполнения логических операторов
     * A	      B	  |  A || B    A && B	 A ^ B	   !A
     * false	false |	 false	   false	 false	  true
     * true	    false |	 true	   false	 true	  false
     * false	true  |	 true	   false	 true	  true
     * true	    true  |	 true	   true	     false	  false
     * <p>
     * Задание №3 "С помощью цикла вывести в консоль 100 раз фразу "Hello, world!"
     * Выполни задание двумя способами, с помощь цикла for и while.
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Это треугольник!");
        } else {
            System.out.println("Это не треугольник!");
        }

        for(int i = 0; i < 100; i++ ){
            System.out.println("Hello, world!");
        }

        int y = 0;
        while (y < 100){
            System.out.println("Hello, world!");
            y++;
        }
    }
}



