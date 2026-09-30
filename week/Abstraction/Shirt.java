public abstract class Shirt {
    String color;
    public Shirt(String color) {
        this.color = color;
    }
    public String GetColor(){
        return color;
    }
    abstract String getDescription();

}

