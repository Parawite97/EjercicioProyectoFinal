package es.eoi.jdbc.entity;

public class Student {
     int id;
     String name;
     String surname;
     String birth_date;

    public Student(int id, String name, String surname, String birth_date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth_date = birth_date;
    }

}
