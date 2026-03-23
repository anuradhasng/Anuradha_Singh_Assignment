package com.coforge.dao;
 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.Transaction;
 
import com.coforge.entities.Item;
import com.coforge.util.HibernateUtil;
 
public class ItemDao implements ItemDaoInterface {
	@Override
	public List<Item> getAllItems() {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("From Item",Item.class).list();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	
}
 
	@Override
	public void insertItem(Item item) {
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			session.persist(item);
			tx.commit();
			System.out.println("Item inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
 
	@Override
	public void updateItem(Item item) {
		
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
		tx=session.beginTransaction();
		session.merge(item);
		tx.commit();
		System.out.println("Item updated");
	}
	catch(Exception e) {
		e.printStackTrace();
		}}
 
	@Override
	public void deleteItem(long id) {
		
		Transaction tx=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
		tx=session.beginTransaction();
        Item i=session.get(Item.class, 3);
		
		if(i!=null) {
			tx=session.beginTransaction();
			tx.commit();
			System.out.println("After deletion: ");
			}
		else {
			System.out.println("no item with this id");	
			tx.commit();
		}
		}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	}
 
 
 
	@Override
	public Item getById(long id) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return session.get(Item.class, id);
	}
	  catch(Exception e) {
			e.printStackTrace();
			return null;
		}	
}
}
 
 