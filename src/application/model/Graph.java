package application.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Graph {

	private ArrayList<Point> points;
	
	//Constructor
	public Graph() {
		this.points = new ArrayList<Point>();
	}
	
	public String toString() {
		String finalString = "";
		//TODO: maybe create this?
		for (int i = 0; i < points.size(); i++) {
			finalString = finalString + this.points.get(i).getX() + " // " + this.points.get(i).getY();
			finalString += "\n";
		}
		
		return finalString;
	}
	
	public void addCoord(Point location) {
		if (this.points != null) {
			this.points.add(location);
		}
	}
	
	public void loadPoints(String fileName) {
		Scanner scan = null;
		
		try {
			scan = new Scanner( new File(fileName));
			
			//1.763600048,1.224233318
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				
				if (line != null) {
					String[] tokens = line.split(",");
					Point temp = null;
					
					temp = new Point(Float.parseFloat(tokens[0]), Float.parseFloat(tokens[1]));
					
					if (temp != null) {
						this.addCoord(temp);
					}
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		if (scan != null) {
			scan.close();
		}
	}

	/**
	 * @return the points
	 */
	public ArrayList<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
}
