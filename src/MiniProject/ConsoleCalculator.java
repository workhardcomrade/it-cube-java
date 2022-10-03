package MiniProject;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isLoopFlag;

        System.out.println("=== Консольный калькулято ===\n");
        System.out.println("       *** Справка ***      ");
        System.out.println("|\"+\" - сложение            |");
        System.out.println("|\"-\" - вычитание           |");
        System.out.println("|\"*\" - умножение           |");
        System.out.println("|\"/\" - деление             |");
        System.out.println("|\"^\" - возведение в степень|");
        System.out.println("|\"rad\" - извлечение корня  |\n");

        do {
            isLoopFlag = false;

            System.out.println("Введите первый операнд:");
            double operand_1 = scanner.nextDouble();

            System.out.println("Введите необходимый оператор:");
            String operator = scanner.next();

            System.out.println("Введите второй операнд:");
            double operand_2 = scanner.nextDouble();

            switch (operator) {
                case "+":
                    System.out.println("Рузультат: " + (operand_1 + operand_2));
                    break;
                case "-":
                    System.out.println("Рузультат: " + (operand_1 - operand_2));
                    break;
                case "*":
                    System.out.println("Рузультат: " + (operand_1 * operand_2));
                    break;
                case "/":
                    if (operand_2 == 0) {
                        System.out.println("Деление на ноль не имеет смысла!");
                    } else {
                        System.out.println("Рузультат: " + (operand_1 / operand_2));
                    }
                    break;
                case "^":
                    System.out.println("Рузультат: " + Math.pow(operand_1, operand_2));
                    break;
                case "rad":
                    System.out.println("Рузультат: " + Math.sqrt(operand_1));
                    break;
                default:
                    System.out.println("Ошибка операции! См. справку.");
            }

            System.out.println("Продолжить вычисления? y/n");
            String continuationWork = scanner.next();
            if (continuationWork.equals("y")) {
                isLoopFlag = true;
            } else {
                System.out.println("Выход...");
                scanner.close();
            }
        } while (isLoopFlag);
    }
}

