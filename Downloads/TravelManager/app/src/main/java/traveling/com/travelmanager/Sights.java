package traveling.com.travelmanager;

/**
 * Created by narek on 7/28/16.
 */
public class Sights {
    String name;
    String destination;
    String about;
    int rate;
    int image;

    protected Sights(String pName, String pDestination, String pAbout, int pImage) {
        name = pName;
        destination = pDestination;
        about = pAbout;
        image = pImage;
    }

    protected Sights(String pName, String pDestination, String pAbout, int pRate, int pImage) {

        name = pName;
        destination = pDestination;
        about = pAbout;
        rate = pRate;
        image = pImage;
    }

    protected int getImage() {
        return image;
    }

    protected void setImage(int pImage) {
        image = pImage;
    }

    protected int getRate() {

        return rate;
    }

    protected void setRate(int pRate) {
        rate = pRate;
    }

    protected String getDestination() {
        return destination;
    }

    protected void setDestination(String pDestination) {
        destination = pDestination;
    }

    protected String getName() {

        return name;
    }

    protected void setName(String pName) {
        name = pName;
    }

    protected String getAbout() {
        return about;
    }

    protected void setAbout(String pAbout) {
        about = pAbout;
    }

}
