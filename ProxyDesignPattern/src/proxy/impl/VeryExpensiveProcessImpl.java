package proxy.impl;

import proxy.VeryExpensiveProcess;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {
	 
    public VeryExpensiveProcessImpl() {
        heavyInitialConfigurationSetup();
    }
     
    @Override
    public void process() {
        System.out.println("Processing is done");
    }
     
    private void heavyInitialConfigurationSetup() {
    	System.out.println("Setting up initial configuration");
    }
     
}