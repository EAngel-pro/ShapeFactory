
public class main {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape BlueSquare = sf.getShape("SQUARE", "BLUE");
		System.out.println(BlueSquare);
		Shape RedTriangle = sf.getShape("TRIANGLE", "RED");
		System.out.println(RedTriangle);
		Shape GreenPentagon = sf.getShape("PENTAGON", "GREEN");
		System.out.println(GreenPentagon);
		Shape PurpleHexagon = sf.getShape("HEXAGON", "PURPLE");
		System.out.println(PurpleHexagon);
		Shape YellowOctagon = sf.getShape("OCTAGON", "YELLOW");
		System.out.println(YellowOctagon);
	}

}
