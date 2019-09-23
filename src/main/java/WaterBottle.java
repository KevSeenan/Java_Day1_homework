public class WaterBottle {

    private int volume;

    public WaterBottle() {
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

    public int volumeToZero() {
        if(this.volume > 0) {
            volume -= 100;
        }
        return this.volume;
    }

    public int volumeToFull() {
        if(this.volume < 100) {
            volume += 100;
        }
        return this.volume;
    }

}
