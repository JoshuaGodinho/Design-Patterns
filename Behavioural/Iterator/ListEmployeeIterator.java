import java.util.List;

public class ListEmployeeIterator implements EmployeeIterator {

    private List<Employee> employees;
    int index=0;

    public ListEmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index < employees.size();
    }

    @Override
    public Employee next() {
    if(this.hasNext()){
        return employees.get(index++);
    }
        return null;
    }
}
