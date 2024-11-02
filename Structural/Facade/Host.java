class Host {
    private Menu italianMenu;
    private Menu chineseMenu;
    private Menu indianMenu;

    public Host(Menu italianMenu, Menu chineseMenu, Menu indianMenu) {
        this.italianMenu = italianMenu;
        this.chineseMenu = chineseMenu;
        this.indianMenu = indianMenu;
    }

    public String getMenu(String cuisine) {
        switch (cuisine.toLowerCase()) {
            case "italian":
                return italianMenu.getMenu();
            case "chinese":
                return chineseMenu.getMenu();
            case "indian":
                return indianMenu.getMenu();
            default:
                return "Sorry, we don't have that cuisine available.";
        }
    }
}