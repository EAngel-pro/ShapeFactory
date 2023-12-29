
public class ShapeFactory {
	 public Shape getShape(String ShapeType, String c)

	    {

	        //Create object here

	        if(ShapeType.equalsIgnoreCase("square")) {

	            return new Square(c);
	        }

	        else if(ShapeType.equalsIgnoreCase("triangle")) {

	            return new Triangle(c);
	        }
	        else if(ShapeType.equalsIgnoreCase("pentagon")) {

	            return new Pentagon(c);
	        }
	        else if(ShapeType.equalsIgnoreCase("hexagon")) {

	            return new Hexagon(c);
	        }
	        else if(ShapeType.equalsIgnoreCase("octagon")) {

	            return new Octagon(c);
	        }

	       else {

	            return null;
	       }

	    }
}
