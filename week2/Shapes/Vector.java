
public class Vector {
    private double x;
    private double y;

    //constructor
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public Vector add(Vector other){
        double newX = this.x + other.x; 
        double newY = this.y + other.y;
        //must use 'new' keyword to call Vector constructor 
        return new Vector(newX, newY);  
    }

    public Vector subtract(Vector other){
        double newX = this.x - other.x; 
        double newY = this.y - other.y;
        return new Vector(newX, newY); 
    }

    public Vector scale(double factor){
        double newX = this.x * factor; 
        double newY = this.y * factor;
        return new Vector(newX, newY);
    }

    //must use Math.pow not ** to square in java. Math.sqrt to square root a number 
    public double length(){
        double rSquared = Math.pow(this.x, 2) + Math.pow(this.y, 2);
        return Math.sqrt(rSquared);
    }

}