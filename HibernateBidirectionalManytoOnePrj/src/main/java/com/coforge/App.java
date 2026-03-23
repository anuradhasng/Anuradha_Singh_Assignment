
package com.coforge;

import java.util.Scanner;

import com.coforge.dao.AuthorDao;
import com.coforge.dao.BookDao;
import com.coforge.entities.Author;
import com.coforge.entities.Book;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthorDao authorDao = new AuthorDao();
        BookDao bookDao = new BookDao();

        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Add Author with Books");
            System.out.println("2. View All Authors");
            System.out.println("3. View All Books");
            System.out.println("4. Update Author");
            System.out.println("5. Delete Author");
            System.out.println("6. Remove Book from Author");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            
            case 1:
                System.out.print("Enter Author Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                Author author = new Author(name, address);

                System.out.print("How many books? ");
                int n = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Book Cost: ");
                    double cost = sc.nextDouble();
                    sc.nextLine();

                    author.addBook(new Book(title, cost));
                }

                authorDao.saveAuthor(author);
                System.out.println("Author added successfully");
                break;

            
            case 2:
                authorDao.getAll();
                break;

            case 3:
                bookDao.getAll();
                break;

            
            case 4:
                System.out.print("Enter Author ID to update: ");
                long aid = sc.nextLong();
                sc.nextLine();

                Author a = authorDao.getById(aid);
                if (a != null) {
                    System.out.print("Enter new name: ");
                    a.setName(sc.nextLine());

                    System.out.print("Enter new address: ");
                    a.setAddress(sc.nextLine());

                    authorDao.updateAuthor(a);
                    System.out.println("Author updated");
                } else {
                    System.out.println("Author not found");
                }
                break;

            
            case 5:
                System.out.print("Enter Author ID to delete: ");
                long delAid = sc.nextLong();

                authorDao.deleteAuthor(delAid);
                System.out.println("Author deleted");
                break;


            case 6:
                System.out.print("Enter Author ID: ");
                long authorId = sc.nextLong();

                System.out.print("Enter Book ID: ");
                long bookId = sc.nextLong();

                authorDao.removeBookFromAuthor(authorId, bookId);
                System.out.println("Book removed from author");
                break;

            case 7:
                System.out.println("Thank You!");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice");
            }
        }
    }
}
