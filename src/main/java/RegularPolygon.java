public class RegularPolygon extends GeometricObject{
   private int n; 
   private double side;
   private double x;
   private double y;
  
   //This is the no arg constructor that
   //creates a default regular polygon
   RegularPolygon(){
	   n = 3;
	   side = 1;
	   x = 0; 
	   y = 0;
   }
   RegularPolygon(int newN, double newSide){
	   n = newN;
	   side = newSide;
   }
   RegularPolygon(int newN, double newSide, double newX, double newY)
   {
	   n = newN;
	   side = newSide;
	   x = newX;
	   y = newY;
   }
   public void setN(int newN) {
	   n = newN;
   }
   public void setSide(double newSide) {
	   side = newSide;
   }
   public void setX(double newX) {
	   x = newX;
   }
   public void setY(double newY) {
	   y = newY;
   }
   public int getN() {
	   return n;
   }
   public double getSide() {
	   return side;
   }
   public double getX() {
	   return x;
   }
   public double getY() {
	   return y;
   }
   public double getPerimeter() {
	   return side * n;
   }
   public double getArea() {
	   return (n * Math.pow(side,2))/(4 * Math.tan(Math.PI/n));
   }
}
