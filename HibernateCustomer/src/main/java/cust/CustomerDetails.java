package cust;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerDetails {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pavan");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Customer customer=new Customer();
	customer.setCid(2);
	customer.setName("Pavan");
	customer.setAge(23);
	customer.setPhno(71889988);
	
	entityTransaction.begin();
	entityManager.persist(customer);
	entityTransaction.commit();
}
}
