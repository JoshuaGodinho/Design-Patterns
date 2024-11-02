public interface Mediator {
    void requestAdvice(WingChef chef);
    void requestPeople(WingChef chef);
    void requestSupplies(Staff staff);
    void respondToAdvice(WingChef chef);
    void respondToPeople(Staff staff);
    void respondToSupplies(Staff staff);
}

