package q1;

public class Main {

    public static void main (String args[]) {
        Location l1 = new Location(12,50);
        Location l2 = new Location(120,30);
        Location l3 = new Location(132,10);
        Location l4 = new Location(112,250);
        Location l5 = new Location(10,5);
        PointOfInterest p1= new ActivityPoint
                ("Carmel View",l1,"Point of view", 1,4,false );
        PointOfInterest p2= new ActivityPoint
                ("Carmel Park",l2,"Children park", 1,3,true );
        PointOfInterest p3= new ActivityPoint
                ("The mountain",l3,"Climbing", 5,5,true );
        PointOfInterest p4= new ServicePoint
                ("Fast food",l4,"Fast food resturant", 1 );
        PointOfInterest p5= new ServicePoint
                ("The Best",l5,"Chef resturant", 4 );
        Area north = new Area(10);
        north.addPointOfInterest(p1);
        north.addPointOfInterest(p2);
        north.addPointOfInterest(p3);
        north.addPointOfInterest(p4);
        north.setDistance(p1, p2, 2);
        north.setDistance(p2, p3, 1);
        north.setDistance(p1, p3, 1.5);
        north.setDistance(p3, p4, 2);

        Path path2 = new Path(north);
        Path path1 = new Path(north);
        path1.addPoint(p4);
        System.out.println("Path 1:\n"+path1);
        try {
            System.out.println("Trying to add p5");
            path2.addPoint(p5);

        }
        catch (PointException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Trying to add p1 and p1");
            path2.addPoint(p1);
            path2.addPoint(p1);
        }
        catch (PointException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Trying to add p2 and p4 after p1");
            path2.addPoint(p2);
            path2.addPoint(p4,1);
        }

        catch (PointException e) {
            System.out.println(e);
        }
        path2.addPoint(p3,1);
        System.out.println("Path 2:\n"+path2);
    }
}
