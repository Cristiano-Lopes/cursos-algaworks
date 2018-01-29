package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.model.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 4l);

		if (cliente != null) {
			em.getTransaction().begin();
			cliente.setNome("Maria Josefina");
			cliente.setIdade(26);
			cliente.setProfissao("Engenheira de Software");
			em.getTransaction().commit();
		} else {
			System.out.println("Cliente não encontrado.");
		}

	}

}
