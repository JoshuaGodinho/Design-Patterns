public class EmployeeInternetAccess implements InternetAccess{
    private String employeeName;
    public EmployeeInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccessToEmployees(){
        System.out.println("Employee " + employeeName + " is granted internet access");
    }
}
