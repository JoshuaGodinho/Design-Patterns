//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InternetAccess access1 = new ProxyEmployeeInternetAccess("joshua", "test123!");
        access1.grantInternetAccessToEmployees();

        System.out.println();

        InternetAccess access2 = new ProxyEmployeeInternetAccess("rebecca", "error");
        access2.grantInternetAccessToEmployees();

    }
}