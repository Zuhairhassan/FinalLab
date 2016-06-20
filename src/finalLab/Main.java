package finalLab;

public class Main {

	public static void main(String[] args) {
  Checking c=new Checking(null, 0);
	c.addinterst();
	c.withdraw(12.4);
	
	savingacount s=new savingacount(null, 0);
	 s.deposit(123.4);
     s.withdraw(334.5);
     
     Person p=new Person("ahmad", 12.3);
	 p.getName("ahmad");
	 p.getSalery(123.4);
	 
	
	}

}
