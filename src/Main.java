import com.workintech.encapsulation.Point;

public class Main {
    public static void main(String[] args){
    Point first = new Point(6,5);
    Point second = new Point(3,1);

   System.out.println("distance(0,0)= " + first.getDistance());
   System.out.println("distance(second)= " + first.getDistance(second));
   System.out.println("distance(2,2)= " + first.getDistance(2, 2));

   Point point = new Point(0,0);
   System.out.println("distance()= " + point.getDistance());

}}