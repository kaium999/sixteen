package sixteen;

public class Case {
	private String model1;
	private String Menufacturer;
	private String powerSupply;
	private Diamensions dimensions;

	public Case(String model1, String menufacturer, String powerSupply, Diamensions dimensions) {
		this.model1 = model1;
		Menufacturer = menufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}

	public String getModel1() {
		return model1;
	}

	public void setModel1(String model1) {
		this.model1 = model1;
	}

	public String getMenufacturer() {
		return Menufacturer;
	}

	public void setMenufacturer(String menufacturer) {
		Menufacturer = menufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public Diamensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Diamensions dimensions) {
		this.dimensions = dimensions;
	}

	public void pressPowerButton() {
		// TODO Auto-generated method stub

	}

}
