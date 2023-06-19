package application.model;

/**
 * Class represents a point with a x coordinate and a y coordinate.
 * for Project1 in CS3343
 * 
 * @author Daniel Botello IV (bit730)
 * Summer 2023
 */

public class Point {
	private float x;
	private float y;
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Getter method for x Coordinate.
	 * 
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * Setter method for x coordinate.
	 * 
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Getter method for y coordinate.
	 * 
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * Setter method for y coordinate.
	 * 
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}
	

	
}
