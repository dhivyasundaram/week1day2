package week1day2;

public class TwoWheeler 
{
	int noofwheels = 4;
	short noofmirrors = 2;
	long chassisnumber = 98435284;
	boolean ispunctured = true;
	String bikename = "Honda activa";
	double runningKm = 38004.451;
public static void main(String[] args){
	TwoWheeler tw = new TwoWheeler();
	System.out.println( "No of wheels= "+ tw.noofwheels);
	System.out.println("No of Mirrors= "+ tw.noofmirrors);
	System.out.println( "Chassis Number= "+ tw.chassisnumber);
	System.out.println( "Bike is punctured="+ tw.ispunctured);
	System.out.println("Bike name="+ tw.bikename);
	System.out.println( "running km=" +tw.runningKm);
}
	
}
