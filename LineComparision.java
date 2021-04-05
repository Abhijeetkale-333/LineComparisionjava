public class EquityOfLines {
	public static void main(String[] args) {
	
	int x1;
	int x2;
	int y1;
	int y2;
	int j1;
	int j2;
	int k1;
	int k2;
	
	x1=30;
	x2=60;
	y1=50;
	y2=70;
	j1=80;
	j2=90;
	k1=30;
	k2=40;

	double A = Math.sqrt((x2-x1)^2+(y2-y1)^2);
	double B = Math.sqrt((j2-j1)^2+(k2-k1)^2);
	System.out.println("the length of line one"+"("+x1+","+x2+")"+"("+y1+","+y2+")"+"is:->"+ A);
	System.out.println("the length of line two"+"("+x1+","+x2+")"+"("+y1+","+y2+")"+"is:->"+ B);
	String s1 = A+"";
	String s2 = B+""; 
	if(s1.equals(s2) == true)
		System.out.println("the two lines are equal");
	else
		System.out.println("the two lines are not equal");
}



}

