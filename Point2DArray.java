package tester;

import java.util.Scanner;

import com.app.geometry.copy.Point2D;

class TestPoint2 {
	private Scanner sc = new Scanner(System.in);
	private int numberOfPoints;
	private Point2D[] points = new Point2D[10];

	public void acceptPointArraySize() {
		System.out.print("Enter how many points do you want to plot: ");
		this.numberOfPoints = sc.nextInt();
		// points = new Point2D[numberOfPoints];
	}

	public float setX() {
		System.out.print("X: ");
		return sc.nextFloat();
	}

	public float setY() {
		System.out.print("Y: ");
		return sc.nextFloat();
	}

	public void setPoints() {
		for (int i = 0; i < numberOfPoints; i++) {
			points[i] = new Point2D(setX(), setY());
		}
	}

	public int menu() {
		System.out.println(
				"1. Display details of a specific point\n2) Display x, y co-ordinates of all points\n3) User i/p : 2 indices for the points , validate the indices\n4. Exit");
		return sc.nextInt();
	}

	public void operations(int choice) {
		switch (choice) {
		case 1:
			int index;
			System.out.print("Index: ");
			index = sc.nextInt();
			index = index - 1;
			if (index >= numberOfPoints || index < 0) {
				System.out.println("Invalid choice , pls retry!!!");
				break;
			}
			System.out.println(points[index].getDetails());
			break;
		case 2:
			for (int i = 0; i < numberOfPoints; i++) {
				System.out.println(points[i].getDetails());
			}
			break;
		case 3:
			System.out.print("Start point index: ");
			int start = sc.nextInt() - 1;
			System.out.print("End point index: ");
			int end = sc.nextInt() - 1;
			if (start < 0 || start > numberOfPoints || end < 0 || end >= numberOfPoints) {
				System.out.println("Invalid Index!\nPleas Try Again!");
				break;
			}
			if (points[start].equals(points[end])) {
				System.out.println("Points are same");
				System.out.println();
			} else {
				System.out.println("Point1 and Point2 are Not Equal");
				points[start].calculateDistance(points[end]);
				System.out.println("Distance Between p1 and p2 is: " + points[start].getDetails());
				System.out.println();
			}
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Invalid choice , pls retry!!!");
			break;
		}
	}
}

public class Point2DArray {

	public static void main(String[] args) {
		TestPoint2 t1 = new TestPoint2();
		t1.acceptPointArraySize();
		t1.setPoints();
		while (true) {
			int choice = t1.menu();
			t1.operations(choice);
		}
	}
}
