public abstract class Staff {

    protected Mediator mediator;
    protected String name;

    public Staff(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void requestSupplies(){
        mediator.requestSupplies(this);
    }

    public void respondToSupplies() {
        mediator.respondToSupplies(this);
    }

    public void respondToPeople() {
        mediator.respondToPeople(this);
    }
}
