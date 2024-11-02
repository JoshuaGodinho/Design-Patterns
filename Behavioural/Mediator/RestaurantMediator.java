import java.util.ArrayList;
import java.util.List;

public class RestaurantMediator implements Mediator{

    private List<WingChef> chefPool;

    public RestaurantMediator() {
        this.chefPool = new ArrayList();
    }

    public void addChefToPool(WingChef chef) {
        chefPool.add(chef);
    }

    @Override
    public void requestAdvice(WingChef chef) {
        System.out.println(chef.getName() + " Head Chef is requesting advice.");

        for(WingChef c : chefPool) {
            if(c.isAvailable() && c!=chef){
                c.setAvailable(false);
                c.respondToAdvice();
                c.setAvailable(true);
                return;
            }
        }
        System.out.println("No available chef to respond.");
    }

    @Override
    public void requestPeople(WingChef chef) {
        System.out.println(chef.getName() + " Head Chef is requesting more people.");
    }

    @Override
    public void requestSupplies(Staff staff) {
        System.out.println(staff.getName() + " staff member is requesting supplies.");
    }

    @Override
    public void respondToAdvice(WingChef chef) {
        System.out.println(chef.getName() + " Head Chef is responding to the advice request.");
    }

    @Override
    public void respondToPeople(Staff staff) {
        System.out.println(staff.getName() + " staff member is responding to the people request under the order of their head chef.");
    }

    @Override
    public void respondToSupplies(Staff staff) {
        System.out.println(staff.getName    () + " staff member is responding to the supplies request.");
    }
}
