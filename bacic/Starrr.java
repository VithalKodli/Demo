class Starrr
{
	public static void main(String[] args) 
	{
		
		for ( int i=1;i<10;i+=2){
			for(int j=0;j<9-i/2;j++){				
           System.out.println("  ");
		 for ( j =0;j<i;j++)
		   System.out.println(" * ");
		   System.out.println("\n");
		 }
	 
		for( i=7;i>0;i-=2)
		{
		for(int j=0;j<9-i/2;j++)
		
         System.out.println("");
		

       for(int j=0;j<i;j++)
				
		   System.out.println("*");
	        System.out.println("\n");
		}
	}
	}
}