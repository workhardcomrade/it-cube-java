package OOP.Box.Methods;

public class BoxWithMethods {

    double width; // Переменная экземпляра класса.
    double height;
    double depth;

    void volume() {
        System.out.println("Объем " + (width * height * depth)); //Метод volume(). Ключевое слово void - указывает, что метод не возвращает никаих занчения.
    }

    void volume1(double width, double height, double depth) {
        System.out.println("Объем " + (width * height * depth)); // Параметризированный метод. Принимает значения, указываемые при вызове метода. [(возвращаемый тип/void) имя_метода(параметры){тело метода}]
    }

    double volume2(double width, double height, double depth) {
        return width * height * depth; // Параметризированый метод, возвращающий значения, получаемое в результате умножения.
    }
}
