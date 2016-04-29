class Search 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int num [] = {1,2,3,4,7,8,9,4,5};
		int value = 5 ;
		boolean found = false;
		for (int x : num )
		{
			if (x==value)
			{
				found = true;
			}
		   }
			 if (found)
			{
            System.out.println(" value is found" );
			}
			else
			{
				System.out.println("value is not found");
             }
		}
	}