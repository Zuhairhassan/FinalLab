package finalLab;

/**
 * this file is used for acount 
 * in this acount we draw money 
 * also depostit money
 * @author hp
 *
 */
public abstract class Acount {
	public Acount(String N, double s) {
		
		// TODO Auto-generated constructor stub
	}
	protected Integer number;
	protected double bal;

  public Boolean withdraw(double d) {
	  
	return true;
}
	public Integer getNumber()
	{
		return number;
		
	}
	public double getbal()
	{
		return bal;
	}
	public void deposit(double bal)
	{
		bal=1344.55;
	}
	public Person getOwner()
	{
		return null;
		
	}
}
