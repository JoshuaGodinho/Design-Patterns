public class ArrayEmployeeList implements EmployeeIterator{

    private Employee[] employees;
    int index = 0;

    public ArrayEmployeeList(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return index < employees.length;
    }

    @Override
    public Employee next() {
        if(this.hasNext()){
            return employees[index++];
        }
        return null;
    }
}
