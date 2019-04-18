
public class Circle {
    private Vector center;
    private double radius;

    //constructor
    public Circle(Vector center, double radius){
        this.center = center;
        this.radius = radius;
    }   
    
    public double getDiameter(){
        return 2 * radius;
    }
    
    //get area of circle using Math.PI for the value of pi
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public boolean contains(Vector point){
        Vector offset = point.subtract(center);
        return offset.length() <= radius;
    }
    
    public Rectangle boundingBox(){
        double cx = center.getX();
        double cy = center.getY();
        Vector p1 = new Vector(cx - radius, cy - radius);
        Vector p2 = new Vector(cx + radius, cy + radius);
        return new Rectangle(p1, p2);
    }
}