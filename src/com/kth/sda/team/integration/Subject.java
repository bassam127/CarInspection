package com.kth.sda.team.integration;

public interface Subject {
	
	public void register(Observa o);
	public void unrgister(Observa o);
	public void notifyObserver();
	
	
}
