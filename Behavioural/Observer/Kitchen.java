public interface Kitchen {
    void registerWaitStaff(WaitStaff observer, int table);
    void removeWaitStaff(WaitStaff observer, int table);
    void notifyWaitStaff(int table  );
    String getOrderStatus(int table);
    void setOrderStatus(int table, String status);
}
