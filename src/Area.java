import java.util.ArrayList;
import java.util.Iterator;

public class Area implements Iterable<PointOfInterest>{

    private ArrayList<PointOfInterest> pointOfInterests;
    private ArrayList<Distance> distances;

    public Area (int size){
        pointOfInterests = new ArrayList<>(size);
        distances = new ArrayList<>();
    }

    public Iterator<PointOfInterest> iterator(){
        return pointOfInterests.iterator();
    }

    public boolean addPointOfInterest(PointOfInterest p){
        if(pointOfInterests.contains(p)){
            return false;
        }
        return pointOfInterests.add(p);
    }

    public boolean setDistance(PointOfInterest p1, PointOfInterest p2, double distance){
        if(!pointOfInterests.contains(p1) || !pointOfInterests.contains(p2)){
            return false;
        }
        Distance tempDistance = new Distance(p1, p2, distance);
        for (Distance dis : distances) {
            if(dis.equals(tempDistance)){
                dis.setDistance(distance);
                return true;
            }
        }
        distances.add(tempDistance);
        return true;
    }

    public double getDistance(PointOfInterest p1, PointOfInterest p2){
        double distance = -1;
        if(pointOfInterests.contains(p1) && pointOfInterests.contains(p2)){
            distance = 0;
            Distance tempDistance = new Distance(p1, p2);
            for (Distance dis : distances) {
                if(dis.equals(tempDistance)){
                    return dis.getDistance();
                }
            }
        }
        return distance;
    }
}
