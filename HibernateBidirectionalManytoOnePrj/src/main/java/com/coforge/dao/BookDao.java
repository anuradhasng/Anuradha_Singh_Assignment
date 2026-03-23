package com.coforge.dao;
 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.Transaction;
 
import com.coforge.entities.Author;
import com.coforge.entities.Book;
import com.coforge.util.HibernateUtil;
 
//import jakarta.transaction.Transaction;
 
public class BookDao {
   
	public void getAll(){
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			session.createQuery("From Book", Book.class).list().forEach(System.out::println);
		}
	}
	public void saveBook(Book book) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			Transaction tx= session.beginTransaction();
			session.persist(book);
			tx.commit();
		}
	}
	public Book getById(long bid) {
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			return  session.get(Book.class, bid);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
 
 
 