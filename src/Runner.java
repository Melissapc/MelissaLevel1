public class Runner {
public static void main(String[] args) {
    smurfs papasmurf = new smurfs("papa smurf");
	System.out.println("Papasmurf");
	System.out.println(papasmurf.isGirlOrBoy());
	System.out.println(papasmurf.getHatColor());
	smurfs smurfette = new smurfs("smurfette");
	System.out.println("smurfette");
	System.out.println(smurfette.isGirlOrBoy());
	System.out.println(smurfette.getHatColor());
	
}
}
