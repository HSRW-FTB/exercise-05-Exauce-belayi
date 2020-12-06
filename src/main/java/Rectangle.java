class Rectangle extends GeometricObject {
private double width, height;

public Rectangle() {
}

public Rectangle(double width, double height) {
  this.width = width; 
  this.height = height;
}

public Rectangle(double width, double height, String color, boolean filled) {
super(color, filled); 
  this.width = width; 
  this.height = height;
}

void setFilled(int n) { 
if (n>0) super.setFilled(true);
else super.setFilled(false);
}

void changeColor(String color) {
super.setColor(color);
}
}
