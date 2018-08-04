
public class VDemo {

	public static void main(String[] args) {
		Vehicle vehicle[]=new Vehicle[3];
		vehicle[0]=new TwoWheeler();
		vehicle[1]=new ThreeWheeler();
		vehicle[2]=new FourWheeler();
		
		for(int i=0;i<3;i++)
		{
			if(vehicle[i].getClass().getName().equals("ThreeWheeler")) //call the object which has the same name as mentioned
			{
				vehicle[i].start();
			}
		}

	}

}
