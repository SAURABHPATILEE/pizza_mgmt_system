package withoutMain;

public class Car {
	 private int model;
	 private String color,fuel;
	 public Car()
	 {
		 System.out.println("Default Constr");
		model=111;
		color="Blue";
		fuel="CNG";
	 }
	 public Car(int model,String color,String fuel)
	 {
		 System.out.println("Parmeter Constr");
		 this.model=model;
		 this.color=color;
		 this.fuel=fuel;
	 }
	 
	 public  void speed()
	 {
		 System.out.println("Default speed is 60km/hr");
	 }
	 
	 public String toString()
	 {
		 return model+"  "+color+"  "+fuel;
	 }
}
