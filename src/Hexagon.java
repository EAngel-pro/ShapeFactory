
public class Hexagon extends Shape {
	private String color;

    public Hexagon(String c){
         //sides=s;
         //name=n;
         color=c;
    }

	@Override
	public int getSides() {
		return 6;
	}

	@Override
	public String getName() {
		return "Hexagon";
	}

	@Override
	public String getColor() {
		return this.color;
	}

}
