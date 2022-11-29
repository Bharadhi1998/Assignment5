package com.bharadhi.ass5;

import com.bharadhi.ass5.Person.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonRepository {
   private EntityManager entityManager;
    public PersonRepository(){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("data");
        this.entityManager=emf.createEntityManager();
    }
    public Person addPerson (Person person){
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
        return person;
    }
}
