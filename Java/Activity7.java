package activities;

	interface BicycleParts{
		int tyres=2;
		int maxSpeed=20;
	}
	interface BicycleOperations{
		void applyBrake(int decrementValue);
		void speedUp(int incrementValue);
		
	}
	class Bicycle implements BicycleOperations,BicycleParts{
		int gears;
		int currentSpeed;
		Bicycle(int gears,int currentSpeed){
			this.gears=gears;
			this.currentSpeed=currentSpeed;
		}
		@Override
		public void applyBrake(int decrementvalue) {
			System.out.println("Cycle speed decreement");
			if(currentSpeed!=0) {
				currentSpeed-=decrementvalue;
			}else {
				System.out.println("Bicycle stopped");
				
			}
		}
		@Override
		public void speedUp(int incrementValue) {
			System.out.println("Cycle speed increesed");
			if(currentSpeed!=maxSpeed) {
				currentSpeed+=incrementValue;
			}else {
				System.out.println("Cycle at max speed!");
			}
		}
		public void bicycleDesc() {
			System.out.println("Bicyle has" + gears +"gears"+tyres+"tyres and a maxspeed of"+ maxSpeed);
			System.out.println("its current Speed is:" +currentSpeed);
		}
		
		
	} 
	 class MountainBike extends Bicycle{
		 int seatHeight;
		 MountainBike(int gears,int currentSpeed, int seatHeight){
			 super(gears,currentSpeed);
			 this.seatHeight=seatHeight;
			 
		 }
		 public void setSeatHeight(int newValue) {
			 this.seatHeight=newValue;
		 }
		 @Override
		 public void bicycleDesc() {
			 System.out.println("MountaonBike has"+gears +"gears"+ tyres +"tyres and a maxspeed of"+maxSpeed);
			 System.out.println("current seat height is :"+seatHeight);
			 System.out.println("current speed is:" +currentSpeed);
		 }
	 }
	public class Activity7 {
		public static void main(String[] args) {
			Bicycle mb=new MountainBike(3,0,25);
			mb.bicycleDesc();
			mb.bicycleDesc();
            mb.speedUp(20);
            mb.applyBrake(5);
		}


	
}
