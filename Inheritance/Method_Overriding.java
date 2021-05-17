/*WAP to create a class Vehicle with method as run() -displaying the speed of vehicle and over-ride it in a child class Car.
*/
 
 class Vehicle{
 	public void run(){
 		System.out.println("Speed of Vehicle is 120 m/s ");
 	
 	}
 }
  
  class Car extends Vehicle{
  	public void run(){
  		System.out.println("Speed of Car is 33.33 k/hr ");
  		super.run();
  	}
  }
  class Method_Overriding {
  	public static void main(String args[]){
  		Car C1 = new Car();
  		C1.run();
  	}
  }
