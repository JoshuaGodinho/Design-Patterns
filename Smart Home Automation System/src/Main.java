//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            UserPool userPool = new UserPool();

            SystemControllerProxy proxy1 = new SystemControllerProxy("joshua", "test123!", userPool);
            SystemControllerProxy proxy2 = new SystemControllerProxy("muskan", "test123!", userPool);
            SystemControllerProxy proxy3 = new SystemControllerProxy("rebecca", "test123!", userPool);
            proxy2.operateAll();
            proxy1.logout();


            UserPool premiumUserPool = new PremiumUserPoolDecorator(userPool);

            SystemControllerProxy proxy4 = new SystemControllerProxy("rebecca", "test123!", premiumUserPool);
            SystemControllerProxy proxy5 = new SystemControllerProxy("joshua", "test123!", premiumUserPool);

            ((PremiumUserPoolDecorator) premiumUserPool).submitSupportRequest(Priority.INTERMEDIATE);

            DeviceFactory philipsFactory=new PhilipsFactory();
            DeviceFactory samsungFactory=new SamsungFactory();

            SmartDevice philipsLight=philipsFactory.createSmartLight();
            SmartDevice samsungThermostat =samsungFactory.createSmartThermostat();


            Room livingRoom = new Room("Living Room");
            livingRoom.add(philipsLight);
            livingRoom.add(samsungThermostat);


            PhilipsLight philipsLight1 = (PhilipsLight) philipsLight.clone();
            SamsungThermostat samsungThermostat1=(SamsungThermostat) samsungThermostat.clone();

            Room kitchen = new Room("Kitchen");
            kitchen.add(philipsLight1);
            kitchen.add(samsungThermostat1);

             Floor groundFloor = new Floor("Ground Floor");
             groundFloor.add(livingRoom);
             groundFloor.add(kitchen);

             proxy4.addFloor(groundFloor);


             proxy4.operateAll();
    }
}