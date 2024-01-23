package it.epicode.dao;


import it.epicode.entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO(){
        emf = Persistence.createEntityManagerFactory("epicodejpa");
        em = emf.createEntityManager();
    }

    public void inserisciPersona(Persona p){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(p);


        et.commit();

        em.refresh(p);

    }

    public Persona getById(int id){
        return em.find(Persona.class,id);
    }

    public void cancellaPersona(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Persona p = getById(id);
        em.remove(p);

        et.commit();
    }


}
