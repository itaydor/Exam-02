package q1;

public class Distance {

    private PointOfInterest p1;
    private PointOfInterest p2;
    private double distance;

    public Distance(PointOfInterest p1, PointOfInterest p2) {
        this.p1 = p1;
        this.p2 = p2;
        distance = 0;
    }

    public Distance(PointOfInterest p1, PointOfInterest p2, double distance) {
        this(p1, p2);
        this.distance = distance;
    }

    public PointOfInterest getP1() {
        return p1;
    }

    public void setP1(PointOfInterest p1) {
        this.p1 = p1;
    }

    public PointOfInterest getP2() {
        return p2;
    }

    public void setP2(PointOfInterest p2) {
        this.p2 = p2;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
        public boolean equals(Object obj) {
            if((obj instanceof Distance dis)){
                return (p1.equals(dis.p1) && p2.equals(dis.p2)) || (p1.equals(dis.p2) && p2.equals(dis.p1));
            }
            return false;
        }
}
