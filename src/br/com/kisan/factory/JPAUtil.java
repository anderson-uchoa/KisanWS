package br.com.kisan.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("appKisan");

	private static ThreadLocal<EntityManager> ems = new ThreadLocal<EntityManager>();

	public static EntityManager getEntityManager() {
		EntityManager em = ems.get();
		if (em == null) {
			em = factory.createEntityManager();
			ems.set(em);
		}
		return em;
	}

	public static void closeEntityManager() {
		EntityManager em = ems.get();
		if (em != null) {
			EntityTransaction tx = em.getTransaction();
			if (tx.isActive()) {
				tx.commit();
			}
			em.close();
			ems.set(null);
		}
	}
}
