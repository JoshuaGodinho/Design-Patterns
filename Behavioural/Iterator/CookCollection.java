import java.util.List;

public class CookCollection implements EmployeeCollection{

    private List<Employee> cooks;

    public CookCollection(List<Employee> cooks){
        this.cooks = cooks;
    }

    @Override
    public EmployeeIterator createEmployeeIterator() {
        return new ListEmployeeIterator(cooks);
    }
}
