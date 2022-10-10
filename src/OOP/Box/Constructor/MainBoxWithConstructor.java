package OOP.Box.Constructor;

public class MainBoxWithConstructor {
    public static void main(String[] args) {
        BoxWithConstructor box = new BoxWithConstructor(25, 25,25); // Объявление переменной box типа BoxWithConstructor, выделение памяти (new) и вызов конструктора у объекта типа BoxWithConstructor.
        System.out.println("Объем " + box.volume());
    }

}
