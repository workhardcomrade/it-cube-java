package OOP.Box.Methods;

public class MainBoxWithMethods {
    public static void main(String[] args) {
        BoxWithMethods box1 = new BoxWithMethods();

        box1.height = 10;
        box1.width = 10;
        box1.depth = 10;

        box1.volume(); // Вызов метода volume() объекта box1

        box1.volume1(15, 15, 15); // Вызов метода volume() объекта box1 с аргументами

        System.out.println("Объем: " + box1.volume2(20, 20,20)); // Вызов метода volume() объекта box2 с аргументами

    }
}
