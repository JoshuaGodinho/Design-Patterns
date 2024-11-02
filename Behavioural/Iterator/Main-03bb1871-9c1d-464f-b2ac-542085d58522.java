import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee cook1=new Employee("Joshua",20,35);
        Employee cook2=new Employee("Muskaan",20,40);

        List<Employee> cooks=new ArrayList<Employee>();
        cooks.add(cook1);
        cooks.add(cook2);

        Employee waitstaff1=new Employee("Person1",10,40);
        Employee waitstaff2=new Employee("Person2",10,30);

        Employee[] waitstaff={waitstaff1,waitstaff2};

        EmployeeCollection cookCollection=new CookCollection(cooks);
        EmployeeCollection waitStaffCollection=new WaitStaffCollection(waitstaff);

        EmployeeIterator cookIterator=cookCollection.createEmployeeIterator();
        EmployeeIterator waitStaffIterator=waitStaffCollection.createEmployeeIterator();

        System.out.println("Salaries for cooks:");
        printSalaries(cookIterator);

        // Calculate and print salaries for waitstaff
        System.out.println("\nSalaries for waitstaff:");
        printSalaries(waitStaffIterator);
    }

    public static void printSalaries(EmployeeIterator iterator) {
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.getName() + ": $" + employee.calculateSalary());
        }
    }
}