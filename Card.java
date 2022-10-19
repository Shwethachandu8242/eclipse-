class Card{
	
	static String type;
    static double height;
    static double width;
    static int price;
    static String colours[];
    
	
	static void displayDetails()
	{
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		
		if(colours!=null)
		{
			System.out.println("array is pointing to colours");
			for(int position=0;position<colours.length;position++)
			{
				String ref=colours[position];
				System.out.println(ref+ "position" +position);
				
			}
			
		}
		else
		{
			System.out.println("array is not pointing to colors");
		}
			
	}

}

        
