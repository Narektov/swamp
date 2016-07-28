package traveling.com.travelmanager;

/**
 * Created by narek on 7/28/16.
 */
public class Hotels {
    String name;
    String place;
    String about;
    int destination;
    int stars;
    int rate;

    protected Hotels(String pName, String pPlace, String pAbout, int pDestination) {
        name = pName;
        place = pPlace;
        about = pAbout;
        destination = pDestination;
    }

    protected Hotels(String pName, String pAbout, String pPlace, int pDestination, int pStars, int pRate) {
        name = pName;
        about = pAbout;
        place = pPlace;
        destination = pDestination;
        stars = pStars;
        rate = pRate;
    }

    protected String getName() {

        return name;
    }

    protected void setName(String pName) {
        name = pName;
    }

    protected String getPlace() {

        return place;
    }

    protected void setPlace(String pPlace) {
        place = pPlace;
    }

    protected String getAbout() {
        return about;
    }

    protected void setAbout(String pAbout) {
        about = pAbout;
    }

    protected int getDestination() {
        return destination;
    }

    protected void setDestination(int pDestination) {
        destination = pDestination;
    }

    protected int getStars() {
        return stars;
    }

    protected void setStars(int pStars) {
        stars = pStars;
    }

    protected int getRate() {
        return rate;
    }

    protected void setRate(int pRate) {
        rate = pRate;
    }
}
