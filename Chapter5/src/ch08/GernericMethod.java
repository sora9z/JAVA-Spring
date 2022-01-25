package ch08;

public class GernericMethod {
	
	public static<T,V> double makeRectangle(Point<T,V> p1,Point<T,V> p2) {
		
		double left=((Number)p1.getX()).doubleValue();
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue(); 
		
		double width=right-left;
		double heigh=bottom-top;
		
		return width*heigh;
	}
	

	public static void main(String[] args) {
		
		Point <Integer,Double> p1=new Point <Integer, Double>(0,0.0);
		Point <Integer,Double> p2=new Point <>(10,10.0); // 안 써도 됨  
		
		double size=GernericMethod.<Integer,Double>makeRectangle(p1,p2);
		System.out.println(size);

		
	}

}
