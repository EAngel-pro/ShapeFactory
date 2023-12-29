
public class Square extends Shape{
	//private int sides;
	//private String name;
	private String color;

    public Square(String c){
         //sides=s;
         //name=n;
         color=c;
    }

	@Override
	public int getSides() {
		return 4;
	}

	@Override
	public String getName() {
		return "Square";
	}
	
	@Override
	public String getColor() {
		return this.color;
	}

}
