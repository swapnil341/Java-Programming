package assignments;

import java.util.Scanner;

class Invoice {
	private String partNumber;
	private String partDiscription;
	private int quantity;
	private static double pricePerItem;

	public Invoice() {
		this("", "", 0);
	}

	public Invoice(String partNumber, String partDiscription, int quantity) {
		this.partNumber = partNumber;
		this.partDiscription = partDiscription;
		this.quantity = quantity;
	}

	static {
		pricePerItem = 0.0;
	}

	// Accessor Methods
	public void getPartNumber() {
		System.out.print(this.partNumber);
	}

	public void getPartDiscription() {
		System.out.print(this.partDiscription);
	}

	public void getQuantity() {
		System.out.print(this.quantity);
	}

	public void getPricePerItem() {
		System.out.print(Invoice.pricePerItem);
	}

	// Settor Methods

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0)
			this.quantity = quantity;
		else
			this.quantity = 0;
	}

	public void setPricePerItem(double price) {
		if (price > 0)
			Invoice.pricePerItem = price;
		else
			Invoice.pricePerItem = 0;
	}

	public double calculateInvoiceAmount() {
		return (this.quantity * Invoice.pricePerItem);
	}

}

// Test Class
class InvoiceTest {
	Scanner sc = new Scanner(System.in);
	Invoice invoice = new Invoice();

	public void setInvoice() {
		System.out.print("Part Number: ");
		invoice.setPartNumber(sc.nextLine());

		System.out.print("Part Discription: ");
		invoice.setPartDiscription(sc.nextLine());

		System.out.print("Quantity: ");
		invoice.setQuantity(sc.nextInt());

		System.out.print("Price Per Item: ");
		invoice.setPricePerItem(sc.nextDouble());
	}

	public void getInvoice() {
		System.out.print("\nPart Number: ");
		invoice.getPartNumber();
		System.out.println();

		System.out.print("Part Discription: ");
		invoice.getPartDiscription();
		System.out.println();

		System.out.print("Quantity: ");
		invoice.getQuantity();
		System.out.println();

		System.out.print("Price Per Item: ");
		invoice.getPricePerItem();
		System.out.println();

	}

	public void getInvoiceAmount() {
		System.out.print("Invoice Amount: " + invoice.calculateInvoiceAmount());
	}
}

public class InvoiceClassWithTesterClass {

	public static void main(String[] args) {
		InvoiceTest i = new InvoiceTest();
		i.setInvoice();
		i.getInvoice();
		i.getInvoiceAmount();

	}

}
