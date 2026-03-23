package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;

import com.coforge.entities.Order;
import com.coforge.util.HibernateUtil;

public class OrderDao implements OrderDaoInterface {
	public List<Order> getAllOrders(){
		
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			return session.createQuery("From Order",Order.class).list();
		}
	}

	@Override
	public void insertOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
