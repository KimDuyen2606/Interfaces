package advance.dev;
import java.util.Random;
import java.util.Scanner;

class MainApp implements IShape {
    public static void main(String[] args) {
    	MainApp app = new MainApp();
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhap n: ");
    	int n = sc.nextInt();
    	Shape[] shapes = new Shape[n];
    	app.input(shapes);
    	app.print(shapes);
    	
    }
    @Override
    public void input(Shape[] shapes) {
    	Random random = new Random();
    	for(int i = 0; i < shapes.length; i++) {
    		int choice = random.nextInt(5);
    		switch(choice) {
    		case 0: 
    			shapes[i] = new Triangle(random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
    			break;
    		case 1:
    			shapes[i] = new Circle(random.nextDouble() * 10);
    			break;
    		case 2:
    			shapes[i] = new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10);
    		    break;
    		}
    	}
    }
    @Override
      public void print(Shape[] shapes) {
    	for(Shape shape :shapes) {
    		if(shape instanceof Triangle) {
    			Triangle triangle = (Triangle) shape;
    			System.out.println("Triangle-chu vi: "+triangle.chuvi() + ",dientich: "+triangle.dientich());
    		}else if(shape instanceof Circle) {
    			Circle circle = (Circle) shape;
    			System.out.println("Circle- chu vi: "+circle.chuvi()+",dientich: "+circle.dientich());
    		}else if(shape instanceof Rectangle) {
    			Rectangle rectangle = (Rectangle) shape;
    			System.out.println("Rectangle-chu vi: "+rectangle.chuvi()+",dientich: "+rectangle.dientich());
    		}
    	}
    }
}
