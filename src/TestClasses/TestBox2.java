package TestClasses;

public class TestBox2 {
    public static void main(String[] args) {
        Box box1 = new Box(); // Создаем 2 переменных типа Box. И первой переменной возвращаем ссылку на объект клааса Box.
        Box box2 = box1; // Второй переменной box2 присваиваем ссылку на тот же объект, что и первой переменной box1.
        // Присваивание одной переменной ссылки на объект другой приводит к созданию только копии ссылки на объект, а не копии самого объекта (!!!)

        box1.width = 100; // присваиваем значение пременным экземпляра box1 класса Box
        box1.height = 100;
        box1.depth = 100;

        box2.width = 10; // присваиваем значение пременным экземпляра box2 класса Box
        box2.height = 10;
        box2.depth = 10;

        double volumeBox1 = box1.height * box1.width * box1.depth;
        double volumeBox2 = box2.height * box2.width * box2.depth;

        System.out.println(volumeBox1);
        System.out.println(volumeBox2);
    }
}
