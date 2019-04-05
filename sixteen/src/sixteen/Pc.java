package sixteen;

public class Pc {
	private Case theCase;
	private Motitor monitor;
	private MotherBoard motherBoard;

	public Pc() {
		super();
	}

	public Pc(Case theCase, Motitor monitor, MotherBoard motherBoard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public void setTheCase(Case theCase) {
		this.theCase = theCase;
	}

	public Motitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Motitor monitor) {
		this.monitor = monitor;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

}
