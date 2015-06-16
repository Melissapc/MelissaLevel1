public class Person {
	String firstname;
	String superpower;

	public Person(String firstname,String superpower){
		this.firstname=firstname;
		this.superpower=superpower;
	}
	public String getName(){
		return this.firstname;
	}
	public String getsuperpower(){
		return this.superpower;
	}
	public void setName(String harley){
		this.firstname=harley;{
		}
	}
		public void setsuperpower(String fastrunner){
			this.superpower=fastrunner;
		}
	public String toString()	{
		return this.firstname+ " has mad "+ this.superpower+ " skills";
		
	}
	
	
}

