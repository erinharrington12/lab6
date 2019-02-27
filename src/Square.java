
public class Square extends Rectangle {

	/**
	 * Square constructor. A square is a specific type of rectangle for which the
	 * sizes are equivalent.
	 *
	 * The square should pass information to the rectangle's super constructor.
	 *
	 * @param id     The shape's name identifier, as defined in Shape.java.
	 * @param radius The size of a length of a side.
	 */
	public Square(String id, double size) {
		super(id, size, size);

	}

	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Square"
	 */
	@Override
	public String getShapeType() {
		// TODO Auto-generated method stub
		return "Square";
	}

}
