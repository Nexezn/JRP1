package application;

import application.model.Graph;

public class Main {

	public static void main(String[] args) {
	
		Graph graph1 = new Graph();
		

		graph1.loadPoints("data/input.csv");
		System.out.println(graph1.toString());

	}

}
