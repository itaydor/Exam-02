import java.util.ArrayList;
import java.util.Iterator;

public class Path {

    private Area area;
    private ArrayList<PointOfInterest> route;

    public Path (Area area){
        this.area = area;
        route = new ArrayList<>();
    }

    public void addPoint(PointOfInterest point){
        addPoint(point, route.size());
    }

    public void addPoint(PointOfInterest point, int position){
        validateInsertion(point, position);
        if(position >= route.size()){
            route.add(point);
        }
        else{
            route.add(position, point);
        }
    }

    //check if the point isn't existing already in the route,
    //check if the point is in the area
    //check if the position to insert the point is legal
    private void validateInsertion(PointOfInterest point, int position) {
        validatePoint(point);
        validatePositionToAdd(point, position);
    }

    //private function we add to help us to check if the position to add a point is legal
    private void validatePositionToAdd(PointOfInterest point, int position) {
        //if the route is empty it's a legal insertion
        if(route.size() == 0){
            return;
        }
        //if we want to add the point first
        if(position == 0){
            //check if there is route between point and the first point in the route
            if(hasNoRoute(point, route.get(0))){
                throw new PointException("There is no route");
            }
            //it's a legal insertion
            return;
        }
        //if we want to add the point last
        if(position == route.size()){
            //check if there is route between point and the last point in the route
            if(hasNoRoute(point, route.get(route.size() - 1))){
                throw new PointException("There is no route");
            }
            //it's a legal insertion
            return;
        }
        //if we got here, we need to check if it's legal to insert the point in the position
        //check if there is route between point and the point in the route in (position - 1) or (position)
        if(hasNoRoute(point, route.get(position - 1))  || hasNoRoute(point, route.get(position))){
            throw new PointException("There is no route");
        }
        //it's a legal insertion
    }

    // return true if there is no route between p1 and p2
    private boolean hasNoRoute(PointOfInterest p1, PointOfInterest p2) {
        return area.getDistance(p1, p2) == 0;
    }

    //private function that help us to know if the point is already exists in the route or not in the area
    private void validatePoint(PointOfInterest point){
        //check if the point is already in the route
        if(route.contains(point)){
            throw new PointException("Point is already on the path");
        }
        //if we got here, we know route isn't contains point
        //we need to check if the point is in the area
        Iterator<PointOfInterest> iterator = area.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(point)) {
                //it means the area contains the point, we can return true.
                return;
            }
        }
        //if we got here the point isn't in the area, so we throw an exception
        throw new PointException("Point out of area");
    }

    @Override
    public String toString() {
        //set empty string and empty sum
        StringBuilder result = new StringBuilder();
        double totalDistance = 0;

        //run on route except the last point
        for (int i = 0; i < route.size() - 1; i++) {
            //add the name to the string
            result.append(route.get(i).name).append(" - ");
            //add the distance between point in position i and position i+1
            totalDistance += area.getDistance(route.get(i), route.get(i + 1));
        }
        //add the name of the last point
        result.append(route.get(route.size() - 1).name).append("\n");
        //add the total length to the string
        result.append("Length = ").append(totalDistance);
        return result.toString();
    }
}
