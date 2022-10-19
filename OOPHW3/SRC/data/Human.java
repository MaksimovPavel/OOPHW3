package SRC.data;

public class Human {
    private String surname;
    private String name;
    private String gender;
    private String age;

    public Human(String surname, String name, String gender, String age) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Human(){

    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Фамилия: " + surname + ", Имя: " + name + ", Пол: " + gender + ", Возраст: " + age ;
    }
    
}