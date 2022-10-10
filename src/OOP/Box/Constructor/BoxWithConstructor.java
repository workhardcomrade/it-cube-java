package OOP.Box.Constructor;

public class BoxWithConstructor {
    double width; // Переменная экземпляра класса.
    double height;
    double depth;

    BoxWithConstructor(double width, double height, double depth) {  // Создаем конструктор, который будет устанавливать значения для переменных объекта, в момент его создания.

    /* Ключевое слово this означает, что переменная относится к полю класса.
    Оно используется при одинаковых именах переменных в полях класса и параметрах
    методов, чтобы не было путаницы, например при инициализации с помощью
    конструктора */

        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    double volume() {
        return width * height * depth;
    }
}
