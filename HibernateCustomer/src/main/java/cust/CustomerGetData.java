package cust;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerGetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pavan");
      EntityManager entityManager=entityManagerFactory.createEntityManager();
      
      Customer customer=entityManager.find(Customer.class,2);
      System.out.println("The Customer id is:"+customer.getCid());
      System.out.println("The Customer name is:"+customer.getName());
      System.out.println("The Customer age is:"+customer.getAge());
      System.out.println("The Customer phno is:"+customer.getPhno());
	}

}
