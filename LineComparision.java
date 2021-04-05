public class Calculating_Length {

	public static void main(String[] args){
		int x1;
		int x2;
		int y1;
		int y2;
		
		x1=30;
		x2=60;
		y1=50;
		y2=70;
		
		double len=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("the length of line between two cordinates"+"("+x1+","+x2+")"+"("+y1+","+y2+")"+"is:->"+len);
	}
}

