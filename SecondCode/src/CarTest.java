import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		boolean quit = false;
		String toQuit; 
		String model, make, color;
		int year = 0;
		Scanner scan = new Scanner(System.in);
		
		//create empty object
		Car car = new Car(" "," "," ",0);

		while(!quit)
		{
			System.out.println("Please Enter The Car Make, Model, Color and Year: ");
			make = scan.next();
			model = scan.next();
			color = scan.next();
			year = scan.nextInt();
			
			//assign data to object
			car.setMake(make);
			car.setModel(model);
			car.setColor(color);
			car.setYear(year);
			scan.nextLine();
			
			System.out.println("Here's The Data You Provided: "+ car);
			System.out.println("Press 'Q' to quit or any key to continue");
			toQuit = scan.next();
			
			if (toQuit.equalsIgnoreCase("Q"))
			    quit = true;
		}
		scan.close();
		car.quitScanner();
		System.out.print("Student work Mesfer Al-Khathami Thank you for your interest.");	
	}

}
