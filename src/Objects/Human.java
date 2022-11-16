package Objects;

public class Human {
    private String name;
    private int age;
    private boolean gender;
    private Human father;
    private Human mother;


    public Human(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, int age, boolean gender, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
    }

}