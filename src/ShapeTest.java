import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for shapes and their comparators.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeTest
{
	//==================================================================================================================
	// Basic Shape Testing:
	//==================================================================================================================
    /**
     * Tests for the square class.
     */
	@Test
	public void SquareTest()
	{
		Shape sqr = new Square("Square1", 3.0);
		Assert.assertEquals("Square area incorrect.", 9.0, sqr.getArea(), 0.0001);
		Assert.assertEquals("Square perimeter incorrect.", 12.0, sqr.getPerimeter(), 0.0001);
		Assert.assertEquals("Square type incorrect.", "Square", sqr.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Square1", sqr.getId());
	}

	/**
     * Tests for the rectangle class.
     */
	@Test
	public void RectangleTest()
	{
		// TODO: complete this...
		Shape rect = new Rectangle("Rectangle1", 3.0, 4.0);
		Assert.assertEquals("Rectangle area incorrect.", 12.0, rect.getArea(), 0.0001);
		Assert.assertEquals("Rectangle perimeter incorrect.", 14.0, rect.getPerimeter(), 0.0001);
		Assert.assertEquals("Rectangle type incorrect.", "Rectangle", rect.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Rectangle1", rect.getId());
	}

	/**
     * Tests for the EquilateralTriangle class.
     */
	@Test
	public void TriangleTest()
	{
		// TODO: complete this...
		Shape triangle = new EquilateralTriangle("EquilateralTriangle1", 3.0);
		Assert.assertEquals("EquilateralTriangle area incorrect.", 3.9, triangle.getArea(), 0.01);
		Assert.assertEquals("EquilateralTriangle perimeter incorrect.", 9.0, triangle.getPerimeter(), 0.0001);
		Assert.assertEquals("EquilateralTriangle type incorrect.", "EquilateralTriangle", triangle.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "EquilateralTriangle1", triangle.getId());
	}

	/**
     * Tests for the trapezoid class. Also test that IDs are done correctly.
     */
	@Test
	public void TrapezoidTest()
	{
		// TODO: complete this...
		Shape trap = new Trapezoid("Trapezoid1", 3.0, 4.0, 5.0, 7.0);
		Assert.assertEquals("Trapezoid area incorrect.", 17.4, trap.getArea(), 0.1);
		Assert.assertEquals("Trapezoid perimeter incorrect.", 19.0, trap.getPerimeter(), 0.1);
		Assert.assertEquals("Trapezoid type incorrect.", "Trapezoid", trap.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Trapezoid1", trap.getId());
	}

	/**
     * Tests for the ellipse class. Also test that IDs are done correctly.
     */
	@Test
	public void EllipseTest()
	{
		Shape circ = new Ellipse("Ellipse1", 3.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(3, 2) + Math.pow(3, 2)) / 2),
				circ.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse1", circ.getId());

		Shape circs = new Ellipse("Ellipse2", 5.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3*5, circs.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(5.0, 2) + Math.pow(3.0, 2)) / 2),
				circs.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse2", circs.getId());
	}

	/**
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	@Test
	public void CircleTest()
	{
		// TODO: complete this...
		Shape circle = new Circle("Circle1", 3.0);
		Assert.assertEquals("Circle area incorrect.", 28.26, circle.getArea(), 0.1);
		Assert.assertEquals("Circle perimeter incorrect.", 18.85, circle.getPerimeter(), 0.1);
		Assert.assertEquals("Circle type incorrect.", "Circle", circle.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle1", circle.getId());
	}

	/**
	 * Tests for Shape's toString().
	 */
	@Test
	public void ShapeToStringTest()
	{
		// TODO: complete this...
	}

	//==================================================================================================================
	// Comparisons:
	//==================================================================================================================
	/**
     * Tests for the Shape Area Comparator class.
     */
	@Test
	public void CompareAreaTest()
	{
	    // Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapeAreaComparator sc = new ShapeAreaComparator();
		Assert.assertEquals("ShapeAreaComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapeAreaComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
     * Tests for the Shape Perimeter Comparator class.
     */
	@Test
	public void ComparePerimeterTest()
	{
		// TODO: complete this...
		
		//Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		Assert.assertEquals("ShapePerimeterComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapePerimeterComparator should find shapes equal.", sc.equals(rect, sqr));
		
		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 0, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 0, sc.compare(sqr2, rect2));
        Assert.assertTrue("ShapePerimeterComparator finds shapes equal.", sc.equals(rect2, sqr2));
		
        // Test unequal perimeter and area:
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
		
	}

	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
	@Test
    public void NaturalCompareTest()
    {
		// TODO: complete this...
		
		//Testing Area 
		Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        
        Assert.assertEquals("Shape.compareTo gave incorrect ordering.", 1, sqr2.compareTo(rect2));
        
        //Test perimeter with equal Areas
        
        Shape rect3 = new Rectangle("R3", 3.0, 4.0); //Perimeter = 14
        Shape rect4 = new Rectangle("R4", 6.0, 2.0); //Perimeter = 16
        Assert.assertEquals("Shape.compareTo gave incorrect ordering", -1, rect3.compareTo(rect4));
    }
}
