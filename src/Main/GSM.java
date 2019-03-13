package Main;

public class GSM {
	private String model;
	private String manufacturer;
	private String owner = null;
	private double price=0;
	private Battery battery ;
	private Display display;
	private static GSM Iphone4S;
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public GSM(String model, String manufacturer, String owner, double price, Battery b, Display d) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.owner = owner;
		this.price = price;
		this.battery = b;
		this.display = d;
	}
	public String toString() {
		return "Model: " + this.model + "\n" + "Manufacturer: " + this.manufacturer + "\n"+
				"Owner: "  + this.owner + "\n" + "Price: " + this.price + "\n" + 
				"Battery: " + this.battery.showInfor() + "Display: " + this.display.showDisplay();
	}

	public static GSM getIphone4S() {
		return Iphone4S;
	}

	public static void setIphone4S(GSM iphone4s) {
		Iphone4S = iphone4s;
	}
}
