/**
 * Created by rohullahayobi on 6/28/17.
 class setters and getters for prameters to reduce minutes and seconds into just degree
 */
public class Coordinate {

    private float degrees;
    private float minutes;
    private float seconds;

    public float getDegrees() {
        return degrees;
    }

    public void setDegrees(float degrees) {
        this.degrees = degrees;
    }

    public float getMinutes() {
        return minutes;
    }

    public void setMinutes(float minutes) {
        this.minutes = minutes;
    }

    public float getSeconds() {
        return seconds;
    }

    public void setSeconds(float seconds) {
        this.seconds = seconds;
    }
}
