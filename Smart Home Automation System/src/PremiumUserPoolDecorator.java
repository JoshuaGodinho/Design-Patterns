import java.util.Set;

public class PremiumUserPoolDecorator extends UserPool {
    private UserPool userPool;
    private SupportHandler customerServiceChain;


    public PremiumUserPoolDecorator(UserPool userPool) {
        this.userPool = userPool;
        this.MAX_POOL_SIZE = 3;

        // Setup customer service chain for premium users
        SupportHandler AIHandler = new AISupportHandler();
        SupportHandler GenericHandler = new GenericSupportHandler();
        SupportHandler SpecialistHandler = new SpecialistSupportHandler();

        AIHandler.setNextHandler(GenericHandler);
        GenericHandler.setNextHandler(SpecialistHandler);

        this.customerServiceChain = AIHandler;  // Set the chain start point
    }

    // Override the login method to use the upgraded pool size
    @Override
    public boolean login(String username, String password) {
        return userPool.login(username, password);
    }


    @Override
    public void logout(String username) {
        userPool.logout(username);
    }

    // Display the users currently logged in
    @Override
    public Set<String> getLoggedInUsers() {
        return userPool.getLoggedInUsers();
    }

    // Premium users can submit a customer service request
    public void submitSupportRequest(Priority priority) {
        System.out.println("Submitting support request for premium user...");
        Request request = new Request(priority);
        customerServiceChain.handleRequest(request);
    }
}
