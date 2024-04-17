package advance.dev;

class Circle extends Shape implements IShape {
     private double radius;
     
     public Circle(double radius) {
    	 super();
    	 this.radius = radius;
     }
     @Override
     public double chuvi() {
    	 return 2 * Math.PI * radius;
     }
     @Override
     public double dientich() {
    	 return Math.PI * Math.pow(radius, 2);
     }
     public void input(Shape[] shapes) {
    	 
     }
     public void print(Shape[] shapes) {
    	 
     }
}
