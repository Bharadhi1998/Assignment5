package com.bharadhi.ass5;
import com.bharadhi.ass5.Person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class assignment5 {
    Person person = new Person();
     List<Person> personList=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        assignment5 ass = new assignment5();
        int choice = 0;
        while (choice != 5) {
            System.out.println("Menu");
            System.out.println("1.Add \n2.Update \n3.Display \n4.Save \n5.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the name: ");
                String name = sc.next();
                System.out.println("Enter the gender: ");
                String gender = sc.next();
                System.out.println("Enter the age: ");
                Integer age = sc.nextInt();
                ass.add(name,gender,age);
            } else if (choice == 2) {

                ass.update(new Person());
            } else if (choice == 3) {
                ass.display();
            } else if (choice == 4) {
                ass.save();
            }
        }
    }

    public void add(String name,String gender,Integer age) {
        personList.add(new Person(name,gender,age));
        System.out.println("Person is added");
    }

    public void display() {
        System.out.println(personList);
    }

    public void update(Person personList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the gender: ");
        String gender = sc.next();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        person.setName(name);
        person.setGender(gender);
        person.setAge(age);
    }
    public void save() {
        PersonRepository repository=new PersonRepository();
        repository.addPerson(person);
    }
}
