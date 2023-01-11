package com.arquitecturajava.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.arquitecturajava.dominio.Libro;

public class Principal3Borrar {

	public static void main(String[] args) {
		
		// Unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		Libro libro = em.find(Libro.class, "1A");
		
		em.getTransaction().begin();
		em.remove(libro);
		em.getTransaction().commit();

	}

}
