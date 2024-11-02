import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProxyEmployeeInternetAccess implements InternetAccess {
    private String employeeName;
    private EmployeeInternetAccess realAccess;
    private Map<String, String> userDatabase = new HashMap<>();

    public ProxyEmployeeInternetAccess(String employeeName, String password) {
        this.employeeName = employeeName;
        loadUserDatabase();
        if (authenticate(employeeName, password)) {
            realAccess = new EmployeeInternetAccess(employeeName);
        } else {
            System.out.println("Authentication failed for user: " + employeeName);
        }
    }

    @Override
    public void grantInternetAccessToEmployees() {
        if (realAccess != null) {
            realAccess.grantInternetAccessToEmployees();
            logAccess(employeeName);
        } else {
            System.out.println("Access denied. Please check your credentials.");
        }
    }

    private void loadUserDatabase() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/user_database.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    userDatabase.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading user database: " + e.getMessage());
        }
    }

    private boolean authenticate(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }

    private void logAccess(String employeeName) {
        System.out.println("Logging access for employee: " + employeeName);
    }
}
