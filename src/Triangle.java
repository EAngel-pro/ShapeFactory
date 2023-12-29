
public class Triangle extends Shape {
	//private int sides;
	//private String name;
	private String color;

    public Triangle(String c){
         //sides=s;
         //name=n;
         color=c;
    }

	@Override
	public int getSides() {
		return 3;
	}

	@Override
	public String getName() {
		return "Triangle";
	}
	
	@Override
	public String getColor() {
		return this.color;
	}

}
