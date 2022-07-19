import java.util.ArrayList;
import java.util.Iterator;

public class AreaUtil {

    public static ArrayList<PointOfInterest> areaPoints (Area area){
        ArrayList<PointOfInterest> pointOfInterests = new ArrayList<>();
        Iterator<PointOfInterest> iterator = area.iterator();
        while (iterator.hasNext()){
            pointOfInterests.add(iterator.next());
        }
        return pointOfInterests;
    }
}
