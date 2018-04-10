
public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "one two thre four five one";
		String str2 = "one two thre four five one";
		
		str = "tres";
		
		String sub = str2.substring(4,7);
		
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("one"));
		System.out.println(str.lastIndexOf("one"));
		
		if(str.equals(str2)) System.out.println("Igual");

		System.out.println(str + str2);
		System.out.println(sub);

		int val = -5;
		int abval;
	    abval = val < 0 ? -val : val; // get absolute valuee
		
		System.out.println(abval);

		String str3 = str.equals(str2) ? "igual" : "Desigual";
		System.out.println(str.equals(str2) ? "igual" : "Desigual");

		
	}

}
