package com.bharadhi.ass5.Person;
import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private Integer age;
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Person() {
    }

    public Person(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Name :" + name + "\n" + "Gender :" + gender + "\n" + "Age :" + age;
    }

    public int hashcode() {
        Person person = new Person(name, gender, age);
        return person.hashcode();
    }

}

