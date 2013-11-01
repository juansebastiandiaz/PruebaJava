package logic;

public class Hilo implements Runnable{

	private Thread hilo;
	private boolean pause;
	private boolean control;

	public Hilo() {
		this.hilo = new Thread();
		this.control = true;
	}
	public void run() {

		while(control){
			try{
				hilo.sleep(50);
			}catch(InterruptedException e) {
				return;
			}
			System.out.println("Hola");
		}
	}
	public void stop(){
		control  = false;
		
	}
	public void start(){
		hilo.start();
	}

}
