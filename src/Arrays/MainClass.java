package Arrays;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        // Создание
        byte[] bytes;
        bytes = new byte[5];

        int[] ints = new int[10];

        String strings[] = new String[5];

        // Инициализация
        short[] shorts = {5, 4, 12, 53, 9};
        String[] names = {"Николай", "Сергей", "Дмитрий"};

        // Обращение к элементу
        short s = shorts[0];
        System.out.println(s);
        System.out.println(shorts[4]);

        // Заполнение
        System.out.println(ints.length);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = 1;
        }

        byte b = 0;
        while (b < bytes.length){
            bytes[b] = 2;
            b++;
        }

        // Вывод содержимого
        for (int j = 0; j < ints.length; j++) {
            System.out.print(ints[b]);
        }

        System.out.println();

        b = 0;
        while (b < bytes.length){
            System.out.print(bytes[b]);
            b++;
        }

        System.out.println();

        for (int num : ints) {
            System.out.print(num);
        }

        System.out.println();

        String contents = Arrays.toString(ints);
        System.out.print(contents);

        // Многомерный массив

        int[][] numbers = new int[10][10];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[j][i] = 8;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j][i] + " ");

            }
        }


    }
}
