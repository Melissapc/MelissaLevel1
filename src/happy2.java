public class happy2 {
	private String name;
	private int bday;

	happy2(int bday, String name) {
		this.bday = bday;
		this.name = name;
	}

	void setName(String newname) {
		name = newname;
	}

	String getName(String anewname) {
		return anewname;
	}

	int getbday() {
		return bday;

	}

	void setiq(int bdayy) {
		bday = bdayy;
	}

	void print(){
		System.out.println(bday +  ""  + name);
	}
}
