package q1;

public abstract class PointOfInterest {

    protected Location location;
    protected String name;
    protected String description;

    public PointOfInterest(String name, Location location, String description) {
        this.location = location;
        this.name = name;
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
