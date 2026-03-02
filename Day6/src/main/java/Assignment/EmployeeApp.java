package Assignment;
 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class EmployeeApp {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        Set<Employee> empSet = new HashSet<>();
 
        int choice;
 
        do {
            System.out.println("\n---- Employee Menu ----");
            System.out.println("1. Create");
            System.out.println("2. Read All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Single Employee Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
 
            choice = sc.nextInt();
 
            switch (choice) {
 
                case 1:
                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
 
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
 
                    empSet.add(new Employee(id, name, salary));
                    System.out.println("Employee added.");
                    break;
 
                case 2:
                    if (empSet.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee e : empSet) {
                            System.out.println(e);
                        }
                    }
                    break;
 
                case 3:
                    System.out.print("Enter Id to update: ");
                    int uid = sc.nextInt();
                    boolean updated = false;
 
                    for (Employee e : empSet) {
                        if (e.getId() == uid) {
                            sc.nextLine();
                            System.out.print("Enter new name: ");
                            e.setName(sc.nextLine());
                            System.out.print("Enter new salary: ");
                            e.setSalary(sc.nextDouble());
                            updated = true;
                            System.out.println("Updated successfully.");
                            break;
                        }
                    }
 
                    if (!updated)
                        System.out.println("Employee not found.");
                    break;
 
                case 4:
                    System.out.print("Enter Id to delete: ");
                    int did = sc.nextInt();
                    Employee removeEmp = null;
 
                    for (Employee e : empSet) {
                        if (e.getId() == did) {
                            removeEmp = e;
                            break;
                        }
                    }
 
                    if (removeEmp != null) {
                        empSet.remove(removeEmp);
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
 
                case 5:
                    System.out.print("Enter Id to search: ");
                    int sid = sc.nextInt();
                    boolean found = false;
 
                    for (Employee e : empSet) {
                        if (e.getId() == sid) {
                            System.out.println(e);
                            found = true;
                            break;
                        }
                    }
 
                    if (!found)
                        System.out.println("Employee not found.");
                    break;
 
                case 6:
                    System.out.println("Program ended.");
                    break;
 
                default:
                    System.out.println("Invalid choice.");
            }
 
        } while (choice != 6);
 
        sc.close();
    }
}