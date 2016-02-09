import java.applet.Applet;


public class dropTest extends Applet {
	
	int criticalHeight=245;
	int bulbsUsed=0;
	
	public void init(){
		
		for (int x=0;x<1000;x++){
			System.out.println("***************************");
			System.out.println("critical height is :"+x);
	    criticalHeight=x;
		broken(1000, 0, bulbsUsed);
		}
		
	}
	
	public int broken(int high, int low, int bulbsUsed){
		
		int midpoint=(high+low)/2;
		
		if((int)midpoint==criticalHeight){
			//System.out.println("done");
			System.out.println("Bulbs Used:   "+bulbsUsed);
			System.out.println("found critical height:  "+midpoint);
			//System.out.println(bulbsUsed);
			return(midpoint);
		}
		
		if((int) midpoint!=criticalHeight){
		if ((int)midpoint>criticalHeight){
			
			broken(midpoint,low,bulbsUsed+1);
		}
		
		if ((int)midpoint<criticalHeight){

			broken(high,midpoint,bulbsUsed+1);
		}}
		
		return(0);
		
	}
	
	
} 
