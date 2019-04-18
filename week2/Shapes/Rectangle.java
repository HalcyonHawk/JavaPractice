
public class Rectangle {
    private Vector p1;
    private Vector p2;

    //constructor
    public Rectangle(Vector p1, Vector p2){
        this.p1 = p1;
        this.p2 = p2;
    } 

    public double getWidth(){
        return p2.getX() - p1.getX();
    }

    public double getHeight(){
        //more efficent to use the getX() and getY() methods from vector class
        //return this.p2.y - this.p2.y; 
        return p2.getY() - p1.getY();  
    }

    public double getArea(){
        return getWidth() * getHeight();
    }

    //uses Vector class methods to find the center 
    public Vector getCenter(){
        return p1.add(p2).scale(0.5);
    }
    
    //check if the point inside the rectangle 
    public boolean contains(Vector point) {
        return p1.getX() <= point.getX() && point.getX() <= p2.getX()
            && p1.getY() <= point.getY() && point.getY() <= p2.getY();
    }
    
}