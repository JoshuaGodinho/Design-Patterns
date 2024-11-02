import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SystemControllerProxy {
    private SystemController realController;
    private boolean isAuthenticated = false;
    private String username;
    private UserPool userPool;


    public SystemControllerProxy(String username, String password,UserPool userPool) {
        this.userPool = userPool;
        this.username=username;
        if (userPool.login(username, password)) {
            realController = SystemController.getInstance();
            isAuthenticated = true;
        }
    }



    public void addFloor(DeviceComponent floor) {
        if (isAuthenticated) {
            realController.addFloor(floor);
        }
    }


    public void operateAll() {
        if (isAuthenticated) {
            realController.operateAll();
        }
    }

    public void logout() {
        userPool.logout(username);
        isAuthenticated = false;
    }

}
