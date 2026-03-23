
package com.coforge;

import com.coforge.dao.ItemDao;
import com.coforge.dao.OrderDao;
import com.coforge.entities.Item;
import com.coforge.entities.Order;

public class App {
    public static void main(String[] args) {

        ItemDao dao = new ItemDao();
        OrderDao ordDao=new OrderDao();

        dao.getAllItems().forEach(item -> System.out.println(item));
        dao.insertItem(new Item(7, "mouse", 1000));
        dao.getAllItems().forEach(item -> System.out.println(item));

        System.out.println(dao.getById(2));

        // complete menu driven code
    }
}
