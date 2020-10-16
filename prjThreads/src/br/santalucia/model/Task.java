package br.santalucia.model;

public class Task extends Thread {

	
	private int id;
	
	public Task(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		doTask();
	}
	
	
	public void doTask() {
		String flag;
		if(this.id % 2 == 0) {
			flag = "P";
		}else {
			flag = "I";
		}
		for(int i= 1; i<=2000; i++) {
			if(i  %  80 == 0) System.out.println();
			System.out.print(flag);
		}
	}
}
