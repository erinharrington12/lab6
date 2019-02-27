
public class Rectangle extends Polygon {

	
	private double height;
	private double width;
	
	
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * width;
	}


	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Rectangle"
	 */
	@Override
	public String getShapeType() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
