
public abstract class Shape {
	public abstract int getSides();
	public abstract String getName();
	public abstract String getColor();

    @Override
    public String toString(){
         return "This "+this.getName()+" has "+this.getSides()+" sides, and is colored " + this.getColor().toLowerCase() + ".";
    }
}
