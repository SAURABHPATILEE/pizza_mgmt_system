// Program on inheritance

package Main;

import withoutMain.Car;
import withoutMain.Nano;
import withoutMain.BMW;
import withoutMain.Ferrari;// import each class individually

public class CarMain {

	public static void main(String[] args) {
		
//		Car c=new Car();
//		System.out.println(c.toString());
		
		Car c1=new Car(222, "Pink", "water");
		System.out.println(c1.toString());// c1.toString to call parametr constr in Car class
//		
//		Nano n =new Nano();
//		System.out.println(n.toString());
			System.out.println("\n");
			
		Nano n1=new Nano(333, "Yellow", "LPG");
		System.out.println(n1.toString());
		n1.speed();
		System.out.println("\n");
//		BMW b=new BMW();
//		System.out.println(b.toString());
		BMW b1=new BMW(444, "Black", "Petrol", 4);
		System.out.println(b1.toString());
		b1.speed();
		
		System.out.println("\n");	
//		Ferrari f=new Ferrari();
//		System.out.println(f.toString());
		Ferrari f1=new Ferrari(555, "Red", "Petrol", 4);
		System.out.println(f1.toString());
		f1.speed();
				
		

	}

}
