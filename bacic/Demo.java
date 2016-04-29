class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Inside super class");
	}

}
class Hello extends Demo//mian method cannot overidden
{
  public static void main(String[] args) 
	{
	  System.out.println("Inside sub class");

	}
}
