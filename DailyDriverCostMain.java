package assignments;

import java.util.Scanner;

class DailyDriverCost {
//  Fields 
//	a) Total miles driven per day.
//	b) Cost per gallon of gasoline.
//	c) Average miles per gallon.
//	d) Parking fees per day.
//	e) Tolls per day.
	private double totalMilesDrivenPerDay;
	private double costPerGallonOfGasoline;
	private double averageMilesPerGallon;
	private double parkingFeesPerDay;
	private double tollsperDay;
	private double dailyDrivingCost;

	// Methods

	public DailyDriverCost() {
		this(0, 0, 0, 0, 0);
	}

	public DailyDriverCost(double totalMilesDrivenPerDay, double costPerGallonOfGasoline, double averageMilesPerGallon,
			double parkingFeesPerDay, double tollsperDay) {
		this.totalMilesDrivenPerDay = totalMilesDrivenPerDay;
		this.costPerGallonOfGasoline = costPerGallonOfGasoline;
		this.averageMilesPerGallon = averageMilesPerGallon;
		this.parkingFeesPerDay = parkingFeesPerDay;
		this.tollsperDay = tollsperDay;
	}

	public void setTotalMilesDrivenPerDay(double totalMilesDrivenPerDay) {
		this.totalMilesDrivenPerDay = totalMilesDrivenPerDay;
	}

	public void setCostPerGallonOfGasoline(double costPerGallonOfFasoline) {
		this.costPerGallonOfGasoline = costPerGallonOfFasoline;
	}

	public void setAverageMilesPerGallon(double averageMilesPerGallon) {
		this.averageMilesPerGallon = averageMilesPerGallon;
	}

	public void setParkingFeesPerDay(double parkingFeesPerDay) {
		this.parkingFeesPerDay = parkingFeesPerDay;
	}

	public void setTollsperDay(double tollsperDay) {
		this.tollsperDay = tollsperDay;
	}

	public double calculateDailyDrivingCost() {

		double gasolinePrice = this.totalMilesDrivenPerDay / this.averageMilesPerGallon * this.costPerGallonOfGasoline;
		this.dailyDrivingCost += tollsperDay + parkingFeesPerDay + gasolinePrice;

		return dailyDrivingCost;
	}
}

public class DailyDriverCostMain {

	public static void main(String[] args) {
		// ********************** calculates your daily driving cost
		Scanner sc = new Scanner(System.in);
		DailyDriverCost d2 = new DailyDriverCost(10, 1000, 5, 20, 300);
		System.out.println(d2.calculateDailyDrivingCost());

		DailyDriverCost d1 = new DailyDriverCost();

		System.out.print("Total Miles Driven Per Day: ");
		d1.setTotalMilesDrivenPerDay(sc.nextDouble());

		System.out.print("Cost Per Gallon Of the Gasoline: ");
		d1.setCostPerGallonOfGasoline(sc.nextDouble());

		System.out.print("Average Miles PerGallon: ");
		d1.setAverageMilesPerGallon(sc.nextDouble());

		System.out.print("Parking Fees Per Day: ");
		d1.setParkingFeesPerDay(sc.nextDouble());

		System.out.print("Tolls Per Day: ");
		d1.setTollsperDay(sc.nextDouble());

		System.out.println(d1.calculateDailyDrivingCost());

	}

}
