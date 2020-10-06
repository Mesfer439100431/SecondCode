//Mesfer Mosleh Al-Khathami.
//Academic Number:439100431.
import java.util.Scanner;  

public class Car{
  
	//private fields
	
	private String _model;
	private String _make;
	private String _color;
	private int _year;
	Scanner scan = new Scanner(System.in);
	
	//constructor
	
	public Car(String make, String color, String model, int year)
	{
		_model = model;
		_make = make;
		_color = color;
		_year = year;
}
	//getters
	public String getModel() { return _model; }
	public String getMake() { return _make; }
	public String getColor() { return _color; }
	public int getYear() { return _year; }
	
	//setters
	public void setModel(String model) { _model = model; }
	public void setMake(String make) { _make = make; }
	public void setColor(String color) { _color = color; }
	public void setYear(int year) 
	{ 
	//year cannot < 1900 or more then 2020  
	while (year < 1900 || year > 2020)
	    {
	             System.out.println("Please Enter Vlid Year");
	             year = scan.nextInt();
		}
	    _year = year; 
	}
	public void quitScanner()
	{
	scan.close();	
	}
	
	public String toString()
	{
	     return _make + " " + _model + " " + _color + " " + Integer.toString(_year);
	}
}
