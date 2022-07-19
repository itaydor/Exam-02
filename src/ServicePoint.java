public class ServicePoint extends PointOfInterest{

    private int stars;

    /**
     * constructor
     * @param name of the point
     * @param location of the point
     * @param description about the point
     * @param stars the point got
     */
    public ServicePoint(String name, Location location, String description, int stars) {
        super(name, location, description);
        this.stars = stars;
    }

    /**
     * getter of stars
     * @return number of stars
     */
    public int getStars() {
        return stars;
    }

    /**
     * setter of stars
     * @param stars number of stars to set
     */
    public void setStars(int stars) {
        this.stars = stars;
    }
}
