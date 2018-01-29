package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.model.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Maria Rita");
		cliente.setIdade(20);
		cliente.setSexo("Feminino");
		cliente.setProfissao("Médica");

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}

}
