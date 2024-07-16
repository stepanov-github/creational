public class PersonBuilder {
    private String name = null;
    private String surname = null;
    private int age = -1;
    private String sity = null;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setSity(String sity) {
        this.sity = sity;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalStateException("Некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null) {
            throw new IllegalStateException("У человека должно быть имя");
        }
        if (surname == null) {
            throw new IllegalStateException("У человека должна быть фамилия");
        }

        return new Person(name, surname, sity, age);
    }

}
