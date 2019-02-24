public class Fan {
	final int SLOW = 1; 
	final int MEDIUM = 1;
	final int FAST = 1;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	Fan()
	{
		
	}
	
	public String toString()
	{
		if(isOn() == true)
		{
			return getSpeed() + " " + getColor() + " "+ getRadius();
		}
		else 
		{
			return getColor() + " " + getRadius() + " " + "fan is off!";
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSLOW() {
		return SLOW;
	}
	public int getMEDIUM() {
		return MEDIUM;
	}
	public int getFAST() {
		return FAST;
	}
	
	
	
	
	
}
