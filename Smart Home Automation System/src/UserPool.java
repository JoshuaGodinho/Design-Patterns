import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserPool {
    static int MAX_POOL_SIZE = 2;
    private Set<String> loggedInUsers = new HashSet<>();
    private Map<String, String> userDatabase = new HashMap<>();

    public UserPool() {
        loadUserDatabase();
    }

    private void loadUserDatabase() {
        String filePath = "src/user_database.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    userDatabase.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading user database: " + e.getMessage());
        }
    }


    public boolean login(String username, String password) {
        if(userDatabase.containsKey(username) && userDatabase.get(username).equals(password)){
            if(loggedInUsers.size()<MAX_POOL_SIZE){
                loggedInUsers.add(username);
                System.out.println(username + " successfully logged in. Users currently logged in: " + loggedInUsers);
                return true;
            }else{
                System.out.println("Login denied for " + username + ". Maximum number of users are already logged in.");
                return false;
            }
        }else{
            System.out.println("Invalid credentials for user: " + username);
            return false;
        }
    }

    public void logout(String username) {
        if (loggedInUsers.contains(username)) {
            loggedInUsers.remove(username);
            System.out.println(username + " logged out. Users currently logged in: " + loggedInUsers);
        } else {
            System.out.println("User " + username + " is not logged in.");
        }
    }

    public Set<String> getLoggedInUsers() {
        return loggedInUsers;
    }
}
