public class Television {
    private String brand;
    private Boolean smart;
    private int buttonsQuantity;
    private Boolean on;
    private int volume;


    //Methods - Behaviors
    public void turnTVOn(){
        setOn(true);
        System.out.println("TV is on");
    }
    public void turnTVOff(){
        setOn(false);
        System.out.println("TV is off");
    }
    public int increaseVolume() {
        setVolume(this.volume += 1);
        return this.volume;
    }

    public Boolean getOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
