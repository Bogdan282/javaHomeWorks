public class Person {
    public String name;
    public String profession;
    public int age;

    Person(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
