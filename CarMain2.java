package Main;

import withoutMain.BMW;
import withoutMain.Car;
import withoutMain.Ferrari;
import withoutMain.Nano;

public class CarMain2 {
public static void main(String[] args) {
		Car[] arr=new Car[5];
		arr[0]=new Car(222, "Pink", "water");
		System.out.println(arr[0].toString());// c1.toString to call parametr constr in Car class

			System.out.println("\n");
			
		arr[1]=new Nano(333, "Yellow", "LPG");
		System.out.println(arr[1].toString());
		arr[1].speed();
		System.out.println("\n");

		arr[2]=new BMW(444, "Black", "Petrol", 4);
		System.out.println(arr[2].toString());
		arr[2].speed();
		
		System.out.println("\n");	

		arr[3]=new Ferrari(555, "Red", "Petrol", 4);
		System.out.println(arr[3].toString());
		arr[3].speed();
				
//		Car c1= (Car)new BMW();// upcasting 
//		c1.speed();// upcasting 
//		
//		Car c=new BMW();// upcasting 
//		c.speed();//upcasting
//		
		
		

	}
}
