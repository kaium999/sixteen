package sixteen;

import javax.management.monitor.Monitor;

public class Main {

	public static void main(String[] args) {

		Diamensions diamensions = new Diamensions(20, 20, 5);
		Case theCase = new Case("2208", "Dell", "240", diamensions);
		Motitor motitor = new Motitor("27inch", "Acher", 27, new Resolution(2540, 1440));
		MotherBoard board = new MotherBoard("b3-100", "asus", 4, 6, "v2.44");
		Pc pc = new Pc(theCase, motitor, board);
		pc.getMonitor().drawPixelAt(1500, 1200, "red");
		pc.getMotherBoard().loadProgram("windows 10.0");
		pc.getTheCase().pressPowerButton();
	}

}
