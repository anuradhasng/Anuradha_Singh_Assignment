
package com.coforge.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Author;
import com.coforge.entities.Book;
import com.coforge.util.HibernateUtil;

public class AuthorDao {

    
    public void getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.createQuery("From Author", Author.class)
                   .list()
                   .forEach(System.out::println);
        }
    }

    
    public void saveAuthor(Author author) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(author);
            tx.commit();
        }
    }


    public Author getById(long aid) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Author.class, aid);
        }
    }

   
    public void updateAuthor(Author author) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(author);
            tx.commit();
        }
    }

    
    public void deleteAuthor(long aid) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Author author = session.get(Author.class, aid);
            if (author != null) {
                session.remove(author);
            }
            tx.commit();
        }
    }

    
    public void removeBookFromAuthor(long aid, long bid) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            Author author = session.get(Author.class, aid);
            if (author != null) {
                Book delBook = null;
                for (Book book : author.getBookList()) {
                    if (book.getBookId() == bid) {
                        delBook = book;
                        break;
                    }
                }
                if (delBook != null) {
                    author.removeBook(delBook);
                }
            }

            tx.commit();
        }
    }
}
