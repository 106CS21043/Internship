package java_1;

public class string_manipulation {
	public static void main(String srgs[]) {
	String s1=new String("BMSCE");
	String s2="college";
	
	String s3="BMSCE".replace('B','#');
	
	String s4="strings are immutable";
	String s5=s4.substring(11,s4.length());
	
	
	
	System.out.println("Concatination :" +s1+" "+s2);
	System.out.println("length of s1 :"+s1.length());
	System.out.println("Replaced string :"+ s3);
	System.out.println("Upper-Case :"+s2.toUpperCase());
	System.out.println("Upper-Case :"+s1.toLowerCase());
	System.out.println("substring :"+s5);
	
}
}