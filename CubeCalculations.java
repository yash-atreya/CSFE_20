import Prog1Tools.IOTools;

public class CubeCalculations{

	public static void main(String[] args){
		System.out.println("Hey buddy  , Welcome to the Mass Calculator");
		String message;
		int side;
		side = IOTools.readInt("Input the side length of your cube in  'cm' " );
		double sidem = (double)side/100;
		int choice;
		System.out.println("Chose the material for your cube");
		System.out.println("Press 1 for plastic");
		System.out.println("Press 2 for wood");
		System.out.println("Press 3 for iron");
		System.out.println("Press any other number for something else");
		choice = IOTools.readInt("give your choice");
		System.out.println("the length of your side in m is : " + sidem );
		int pdensity = 5;
		int wdensity = 15;
		int idensity = 25;
		int density = 1000;
		double volume = sidem*sidem*sidem;
		System.out.println("the volume of your cube is : " + volume );
		double massp = volume*pdensity;
		double massw = volume*wdensity;
		double massi = volume*idensity;
		double mass = volume*density;
		double g = 9.81;
		int k =1;
		double forcep = massp*g*k;
		double forcew = massw*g*k;
		double forcei = massi*g*k;
		double force = mass*g*k;
		
		
		switch(choice){
			case 1: message="You have chosen Plastic and the mass is" +massp + "kg and the force required is " +forcep + "N" ; break;
			case 2: message="You have chosen wood and the mass is" +massw + "kg and the force required is " +forcew + "N"; break; 
			case 3: message="You have chosen iron and the mass is" +massi + "kg and the force required is " +forcei + "N"; break; 
			default: message="You have chosen something else and the mass is" +mass + "kg and the force required is " +force + "N";   
		}
		System.out.println(message);
		
	}
}