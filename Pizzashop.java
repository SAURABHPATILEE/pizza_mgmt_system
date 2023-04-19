package assignmentp;

import java.util.Scanner;

public class Pizzashop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int amount=0,choice,qty,total=0;
    System.out.println("1.veg pizza - 100rs 2.panner pizza - 200rs 3.corn pizza 150rs  4. regular pizaa+combopack  300rs 5.to bill 6.exit");
	do {
		System.out.println("enter the choice");
	 choice=sc.nextInt();
	 
	switch(choice)
	{
	case 1:
		System.out.println("enter the qty of veg pizza");
		 qty=sc.nextInt();
		amount=amount+qty*100;
	System.out.println("amount for"+qty+"pizzza is="+amount);
	break;
	
	case 2:
		System.out.println("enter the qty for pannner pizza");
		qty=sc.nextInt();
		amount=amount+ qty*200;
		System.out.println("amount for"+qty+"pizza="+amount);
		break;
		
	case 3:
		System.out.println("enter the qty for corn pizza");
		qty=sc.nextInt();
		amount=amount+ qty*150;
		System.out.println("amount for"+qty+"pizza="+amount);
		break;
		
	case 4:
		System.out.println("enter the qty for regular pizza");
		qty=sc.nextInt();
		amount=amount+ qty*300;
		System.out.println("amount for"+qty+"pizza="+amount);
		break;
		
		
	case 5:
		System.out.println("total amount="+amount);
		System.out.println("------thank you-----------");
		System.out.println("------come again----------");
		break;
	
	default:
		System.out.println("invaild choice");
	break;
	}
	
	} while(choice!=5);
	
	
	}
}
