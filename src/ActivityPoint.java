public class ActivityPoint extends PointOfInterest{

    private int difficultLevel;
    private int interestLevel;
    private boolean isFree;

    /**
     * Constructor
     * @param name of the point
     * @param location of the point
     * @param description about the point
     * @param difficultLevel of the activity
     * @param interestLevel of the activity
     * @param isFree true if the activity is free
     */
    public ActivityPoint(String name, Location location, String description, int difficultLevel, int interestLevel, boolean isFree) {
        super(name, location, description);
        this.difficultLevel = difficultLevel;
        this.interestLevel = interestLevel;
        this.isFree = isFree;
    }

    /**
     * Getter of the difficult level
     * @return the difficultLevel
     */
    public int getDifficultLevel() {
        return difficultLevel;
    }

    /**
     * Setter of the difficult level
     * @param difficultLevel to set as new difficultLevel
     */
    public void setDifficultLevel(int difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    /**
     * Getter of the interest level
     * @return the interestLevel
     */
    public int getInterestLevel() {
        return interestLevel;
    }

    /**
     * Setter of the interest level
     * @param interestLevel to set as new interest level
     */
    public void setInterestLevel(int interestLevel) {
        this.interestLevel = interestLevel;
    }

    /**
     * Getter of isFree
     * @return true if the activity is free, false otherwise
     */
    public boolean getIsFree() {
        return isFree;
    }

    /**
     * Setter of isFree
     * @param free value to set isFree
     */
    public void setIsFree(boolean free) {
        isFree = free;
    }
}
