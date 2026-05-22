package basics;

public class RemoveJunk {
	public static void main(String[] args)
	{
		String str= "^Y%$#@*&Raj";
		str = str.replaceAll("[^a-z,0-9,A-Z]","");
		System.out.println(str);
	}

}
