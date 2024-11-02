public class ConcreteWaitStaff implements WaitStaff{

    private String name;
    int table;
    private Kitchen kitchen;

    public ConcreteWaitStaff(String name,int table, Kitchen kitchen) {
        this.name = name;
        this.table = table;
        this.kitchen = kitchen;
        kitchen.registerWaitStaff(this,table);
    }

    @Override
    public void update(String dish) {
        System.out.println(name + " (Table " + table + "): Notified that " + dish + " is ready to be served.");
    }

    public void inquireOrderStatus(){
        String orderStatus = kitchen.getOrderStatus(table);
        System.out.println(name + " (Table " + table + "): Inquired order status. Current status: " + orderStatus);
    }

    public void unregister(Kitchen kitchen) {
        kitchen.removeWaitStaff(this,table);
    }
}
