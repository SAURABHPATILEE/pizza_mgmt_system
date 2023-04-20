
import java.util.Scanner;

public class Pizzashop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int amount=0,choice,qty,total=0;
    System.out.println("1.veg pizza - 100rs \n2.panner pizza - 200rs \n3.corn pizza 150rs  \n4.regular pizza+combo pack  300rs \n5.Total \n6.exit");
	do {
		System.out.println("enter the choice");
	 choice=sc.nextInt();
	 
	switch(choice)
	{
	case 1:
		System.out.println("enter the qty of veg pizza");
		 qty=sc.nextInt();
		amount=amount+qty*100;
	System.out.println("amount for "+qty+" pizzza is= "+amount);
	break;
	
	case 2:
		System.out.println("enter the qty for pannner pizza");
		qty=sc.nextInt();
		amount=amount+ qty*200;
		System.out.println("amount for "+qty+" pizza= "+amount);
		break;
		
	case 3:
		System.out.println("enter the qty for corn pizza");
		qty=sc.nextInt();
		amount=amount+ qty*150;
		System.out.println("amount for"+qty+" pizza="+amount);
		break;
		
	case 4:
		System.out.println("enter the qty for regular pizza");
		qty=sc.nextInt();
		amount=amount+ qty*300;
		System.out.println("amount for "+qty+"pizza= "+amount);
		break;
		
		
	case 5:
		System.out.println("Total Amount="+amount);
		System.out.println("------Thank You-----------");
		System.out.println("------Come Again----------");
		break;
	
	default:
		System.out.println("invaild choice!!!");
	break;
	}
	
	} while(choice!=5);
	
	
	}
}
