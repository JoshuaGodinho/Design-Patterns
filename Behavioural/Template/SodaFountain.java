public abstract class SodaFountain {

    public final void dispenseDrink(){
        dispenseSoda();
        addCondiments();
    }


    public abstract void dispenseSoda();

    public abstract void addCondiments();
}
