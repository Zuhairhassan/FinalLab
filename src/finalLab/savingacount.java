package finalLab;


public class savingacount extends Acount{
	
	/**
	 * this is used saving acount
	 * @param N
	 * @param s
	 */
	public savingacount(String N, double s) {
		
		super(N, s);
		
	}
	public Boolean withdraw(double d) {
		   return true;
	}
	public void paycharge()
	{
		
	}

}
