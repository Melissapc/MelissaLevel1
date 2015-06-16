
public class Prettycat {
String type;
String color;
String name;


Prettycat(String type,String color,String name){
this.type=type;	
this.color=color;
this.name=name;
}


public void sleep(){
	System.out.println(this.name+" is sleeping");
}

public void eat(){
	System.out.println(this.name+" is eating");
}
}