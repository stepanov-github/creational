public class Person {
    private final String NAME;
    private String SURNAME;

    private int age = -1;
    private String sity;

    public Person(String name, String surName) {
        this.NAME = name;
        this.SURNAME = surName;
    }

    public Person(String name, String surName, String sity) {
        this(name, surName);
        this.sity = sity;
    }

    public Person(String name, String surName, int age) {
        this(name, surName);
        if (age >= 0 && age < 100) {
            this.age = age;
        }
    }

    public Person(String name, String surName, String sity, int age) {
        this(name, surName, age);
        this.sity = sity;
    }

    public boolean hasAge() {
        return (age == -1) ? false : true;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public boolean hasAddress() {
        return (sity == null) ? false : true;
    }

    public void setAddress(String city) {
        this.sity = sity;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSurname() {
        return SURNAME;
    }

    public int getAge() {
        return age;
    }

    public String getSity() {
        return sity;
    }

    public void setAge(int age) {
        if (!hasAge()) this.age = age;
    }

    @Override
    public String toString() {

        return String.format("Имя:%s, Фамилия:%s. город:%s, возраст:%s",
                NAME, SURNAME, (hasAddress() ? sity : "неизвестно"), (hasAge() ? age : "неизвестно"));
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(SURNAME)
//                .setAge(0) // не совсем понял какой возраст нужно задать ребенку если он может быть любого возраста.
                .setSity(sity);
    }

    @Override
    public int hashCode() {
        return NAME.hashCode() + getSurname().hashCode() + sity.hashCode() + age;
    }
}
