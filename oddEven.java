package training_day_1;

public class oddEven {
	
	public static int r=5;
	public static int c=6;
	

	public static void main(String[] args) {
		
		OddEvenPatern();
		System.out.println();
		OddEvenPatern2();
		System.out.println();
		OddEvenPatern3();

	}
	
	private static void OddEvenPatern()
	{
		int k =4;
		for(int i =1; i<= 5; i++) 
		{
			int lastJCount =0;
				for(int j=0; j<k; j++) 
				{
					System.out.print("*");
					lastJCount = j;
				}
				if(k!=0)
					{
						for(int a = lastJCount+1; a<5; a++) 
						{
							if(i%2 == 0) 
								System.out.print("E");
							else 
								System.out.print("O");
						}
					}
				else
				{
					for(int a = 0; a<5; a++) 
					{
						if(i%2 == 0) 
							System.out.print("E");
						else 
							System.out.print("O");
					}
				}
		k--;
		System.out.println();
		}
	}
	
	private static void OddEvenPatern2()
	{
		for(int i =1; i<= r; i++) 
		{
			for(int a = 0; a<c; a++) 
			{
				if(i%2 == 0) //even
					{
					if(a==0||a==c-1)
						System.out.print(" ");
					else
						System.out.print("*");
					}
				else //odd
					System.out.print("*");
			}
		System.out.println();
		}
			
	}
	
	private static void OddEvenPatern3()
	{
		for(int i =1; i<= r; i++) 
		{
			for(int a = 0; a<c; a++) 
				{
					if(i%2 == 0) //even
					{
						if((a==0||a==1)||(a==c-2||a==c-1))
							System.out.print("*");
						else
							System.out.print("E");
					}
					else //odd
					{
						if((a==0||a==1)||(a==c-2||a==c-1))
							System.out.print("O");
						else
							System.out.print("*");
					}
				}
		System.out.println();
		}
			
	}
	
	

}
