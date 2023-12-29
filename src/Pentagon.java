
public class Pentagon extends Shape {
	private String color;

    public Pentagon(String c){
         //sides=s;
         //name=n;
         color=c;
    }

	@Override
	public int getSides() {
		return 5;
	}

	@Override
	public String getName() {
		return "Pentagon";
	}
	
	@Override
	public String getColor() {
		return this.color;
	}

}
