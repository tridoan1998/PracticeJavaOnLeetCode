
public class Driver {

	public static void main(String[] args) {

		Fan Fan1 = new Fan();
		Fan Fan2 = new Fan();
		
		Fan1.setSpeed(3);
		Fan1.setRadius(10);
		Fan1.setColor("Yellow");
		Fan1.setOn(true);
		
		Fan2.setSpeed(1);
		Fan2.setRadius(5);
		Fan2.setColor("Blue");
		Fan2.setOn(false);
		
		System.out.println(Fan1.toString());
		System.out.println(Fan2.toString());
	}

}
