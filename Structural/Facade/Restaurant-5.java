class Restaurant {
    private Host host;

    public Restaurant() {
        Menu italianMenu = new ItalianMenu();
        Menu chineseMenu = new ChineseMenu();
        Menu indianMenu = new IndianMenu();

        this.host = new Host(italianMenu, chineseMenu, indianMenu);
    }

    public Host getHost() {
        return this.host;
    }
}