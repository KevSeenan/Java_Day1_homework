public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int takeADrink() {
        if(this.volume > 10) {
            volume -= 10;
        }
        return this.volume;
    }


}
