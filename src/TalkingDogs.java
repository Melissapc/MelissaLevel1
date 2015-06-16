
public class TalkingDogs{
	String name ;
	String type ;
	int age ;


TalkingDogs(String name,String type,int age){
	this.name=name;
	this.type=type;
	this.age=age;
}
    String getname(){
		return name;
	   
   }
  int  getage(){
	return age;
    	
    }

	 void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}



