package client;

import proxy.VeryExpensiveProcess;
import proxy.impl.VeryExpensiveProcessProxy;

public class ClientTest {

	public static void main(String[] args) {
		
		VeryExpensiveProcess veryExpensiveProcess = new VeryExpensiveProcessProxy();
		veryExpensiveProcess.process();
		veryExpensiveProcess.process();
	}

}