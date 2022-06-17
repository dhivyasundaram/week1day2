package week1day2;

public class Car {
public boolean applybreak() {
	return (true);
}
public int applygear() {
	int applygear = 5;
	return (applygear);
}
public String switchonac() {
	String switchonac = "on";
	return (switchonac);
}
public float applyaccelerate () {
	float applyaccelerate = 384.17f;
	return (applyaccelerate);
}
public static void main(String[] args) {
	Car c = new Car();
	System.out.println(c.applybreak());
	System.out.println(c.applygear());
	System.out.println(c.switchonac());
	System.out.println(c.applyaccelerate());
	
}
}


	
