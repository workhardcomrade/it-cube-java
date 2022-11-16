package Objects;


public class MainClass {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Деда", 80, true);
        Human grandMother1 = new Human("Бабушка", 75, false);
        Human grandFather2 = new Human("Папа мамы", 75, true);
        Human grandMother2 = new Human("Мама мамы", 72, false);
        Human father = new Human("Отец", 50, true, grandFather1, grandMother1);
        Human mother = new Human("Мать", 47, false, grandFather2, grandMother2);


        System.out.println(father);

    }
}
