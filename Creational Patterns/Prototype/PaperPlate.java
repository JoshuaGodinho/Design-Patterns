public class PaperPlate implements Cloneable{
    private String size;

    public PaperPlate(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }

    @Override
    public PaperPlate clone(){
        return new PaperPlate(size);
    }
}
