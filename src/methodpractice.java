import javax.swing.JOptionPane;

public class methodpractice {
	public static void main(String[] args) {
		methodpractice methods = new methodpractice();
		methods.rocker("name");
		methods.truth1("annoying");
		methods.truth2("awesome");
	}

	  void rocker(String words) {
		System.out.println(words +" rock's");
	}
      void truth1(String annoying) {
    	  System.out.println("rick ashley is annoying");
      }
      void truth2(String awesome) {
    	  System.out.println("PTV is awesome!!!");
      }
}