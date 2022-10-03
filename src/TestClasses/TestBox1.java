package TestClasses;

public class TestBox1 {
    public static void main(String[] args) {
        Box box1; // Объявляем переменную box1 типа Box. Здесь переменная не ссылается на конкретный объект. По умолчанияю box1 хранит значение null.
        box1 = new Box(); // операция new - во время выполения резервирует память для объекта и возвращает ссылку на него. Ссылка - это адрес объекта в памяти. Ссылка сохранаяется в переменной box1.
        // Аналогичный процесс создания объекта box1: Box box1 = new Box();
        // Теперь переменная box1 хранить адрес области памяти на объект типа Box.
        // переменая_класса = new имя_класса ();
        Box box2 = new Box();

        box1.width = 100; // присваиваем значнеие переменной width объкета ! box1 !
        box1.height = 100;
        box1.depth = 100;

        box2.width = 10; // присваиваем значнеие переменной width объкета ! box2 !
        box2.height = 10;
        box2.depth = 10;

        double volumeBox1 = box1.height * box1.width * box1.depth;
        double volumeBox2 = box2.height * box2.width * box2.depth;

        System.out.println(volumeBox1);

        System.out.println(volumeBox2);
    }
}
