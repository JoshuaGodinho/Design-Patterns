public class WaitStaffCollection implements EmployeeCollection{

    private Employee[] waitstaff;

    public WaitStaffCollection(Employee[] waitstaff) {
        this.waitstaff = waitstaff;
    }

    @Override
    public EmployeeIterator createEmployeeIterator() {
        return new ArrayEmployeeList(waitstaff);
    }
}
