
public class TwoDShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Triangle t1 = new Triangle(5,4,"filled");
	  Object ob = new Triangle(3,3,"filled"); // class Object is superclass of all other classes
	  TwoDObject o1 = new Circle(3,"filled");
	  
	  ColorTriangle ct = new ColorTriangle(3,3,"a","a");
	  ColorTriangle ct2 = new ColorTriangle(ct);
	  
	  System.out.println(o1.area());
	  
	  TwoDObject shape = new Triangle(3,2,"filled"); // an object of subclass can be assigned to reference of superclass
	  //reference of superclass, so it cannot access area() in subclass
	  // Then, we need a method area() in superclass only to be overridden. when shape.area() is called
	  // the method in the subclass corresponding to the object assigned to shape is called. So the one in triangle
	  //So, a method is needed in the superclass only to be overridden, unless the reference is also subclass.
	  // This method can then be declared as abstract!! in this approach, the whole class has to be abstract and then no object of superclass can exist (new)! (references can)
	  //A superclass reference can refer to a subclass object!!! interesting to create arrays of objects that are
	  //different but have general things in common
	  System.out.println(shape.area());
	  
	  
	}

}

abstract class TwoDObject{
	
	private double height;
	private double width;
	
	TwoDObject(double width, double height){
		
		this.height = height;
		this.width = width;
		
	}
	
    double getheight() {return height;}
	double getwidth() {return width;}
	void setheight(double height) {this.height = height;}
	void setwidth(double width) {this.width = width;}


	final void showDim() { // final prevents the method to be overridden by subclasses
		System.out.println("Widht and Height are: "  + width + " and " + height);
	}
	
	abstract double area();
}

class Triangle extends TwoDObject{
	
	private String style;
	
	Triangle(double width,double height, String s){
		super(width,height);
		this.style = s;
		
	}
	Triangle(Triangle t){
		super(t.getwidth(),t.getheight());
		this.style = t.style;
		
	}
	
	double area() {
		
		
		return super.getheight() * super.getwidth() / 2;
	}
	
	
	
	void showStyle() {System.out.println("Style is: " + style);}
	
	
	
}

class Circle extends TwoDObject{

	private String style;
	
	Circle(double diameter, String style) {
		super(diameter, diameter);
		this.style = style;
		// TODO Auto-generated constructor stub
	}

	double area() {
		// TODO Auto-generated method stub
		
		return Math.PI * getheight()/2;
	}
	
}




class ColorTriangle extends Triangle{
	
	private String color;

	ColorTriangle(double width, double height, String s, String color) {
		super(width, height, s);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	ColorTriangle(ColorTriangle ct){
		super(ct);
		color = ct.color;
		
		
	}
	
	void setColor(String color){this.color = color;}
	
	void showColor() {System.out.println(color);}
	
	
}









