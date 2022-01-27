package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	
}
}
//insertion


//Itemc itemc = new Itemc();
//itemc.setId(4);
//itemc.setName("book");
//itemc.setCost(123);
//itemc.setQuantity(2);
//
//Itemc itemc2 = new Itemc();
//itemc2.setId(3);
//itemc2.setName("pen");
//itemc2.setCost(213);
//itemc2.setQuantity(1);
//
//AmazonOrder amazonOrder=new AmazonOrder();
//amazonOrder.setId(2);
//amazonOrder.setAddress("gulbarga");
//
//List<Itemc> items=new ArrayList();
//items.add(itemc);
//items.add(itemc2);
//
//amazonOrder.setItems(items);
//entityManager.persist(amazonOrder);
////entityManager.persist(itemc);
////entityManager.persist(itemc2);

//dletion
//AmazonOrder amazonOrder=entityManager.find(AmazonOrder.class,2);
//if(amazonOrder!=null)
//{
//	entityManager.remove(amazonOrder);
//	entityTransaction.commit();
//}






//entityTransaction.commit();