public class WingChef extends Staff{

    private boolean isAvailable;

    public WingChef(Mediator mediator, String name){
        super(mediator, name);
        this.isAvailable = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void requestAdvice() {
        mediator.requestAdvice(this);
    }

    public void requestPeople() {
        mediator.requestPeople(this);
    }

    public void respondToAdvice() {
        mediator.respondToAdvice(this);
    }

    public void respondToPeople() {
        mediator.respondToPeople(this);
    }
}
