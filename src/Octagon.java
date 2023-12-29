
public class Octagon extends Shape {
	private String color;

    public Octagon(String c){
         //sides=s;
         //name=n;
         color=c;
    }

	@Override
	public int getSides() {
		return 8;
	}

	@Override
	public String getName() {
		return "Octagon";
	}

	@Override
	public String getColor() {
		return this.color;
	}

}
