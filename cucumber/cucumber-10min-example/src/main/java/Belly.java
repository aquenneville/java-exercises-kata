
public class Belly {

	private int cukes;
	private int waitTimeInHours;
	private boolean growls;
	
	public Belly() {
		growls = false;
	}
	
	public void eat(int cukes) {
		this.cukes = cukes;
	}

	public void wait(int waitTimeInHours) {
		this.waitTimeInHours = waitTimeInHours;
		this.growls = true;
	}
	
	public boolean bellyGrowls() {
		return growls;
	}
}
