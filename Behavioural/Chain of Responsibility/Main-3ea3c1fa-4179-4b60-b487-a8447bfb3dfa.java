//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SupportHandler AIHandler = new AISupportHandler();
        SupportHandler GenericHandler = new GenericSupportHandler();
        SupportHandler SpecialistHandler = new SpecialistSupportHandler();

        AIHandler.setNextHandler(GenericHandler);
        GenericHandler.setNextHandler(SpecialistHandler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        AIHandler.handleRequest(request1);
        AIHandler.handleRequest(request2);
        AIHandler.handleRequest(request3);
        }
    }