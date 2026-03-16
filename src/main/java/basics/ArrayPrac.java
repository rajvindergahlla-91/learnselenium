package basics;

public class ArrayPrac {
	
	public static void main(String[] args)
	{
		//String name;
		String[] classNames= new String[5];
		classNames[0]="first";
		classNames[1]="second";
		classNames[2]="third";
		classNames[4]="fifth";
		System.out.println("The name of the class is " + classNames[3]);
		System.out.println("====================================");
		for(int i =0; i<5;i++)
		{
			if(classNames[i]==null)
			{
				continue;
			}
			System.out.println(classNames[i]);
			
		}
		
		System.out.println("================================");
		 for(String name:classNames)
		 {
			 if(name==null)
				 continue;
		 
		System.out.println(name);
	}

}
}
