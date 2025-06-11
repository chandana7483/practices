package activities;

public class Activity2 {

	public static void main(String[] args) {
	 
	int [] ar= {10,20,30,10,10};
	int sum=0;
	
  for(int i=0;i<ar.length;i++) {
	  sum=sum+ar[i];
  }
   if(sum==30) {
	   System.out.println("yes");
   }
   else {
	   System.out.println("no");
   }
	}

}
