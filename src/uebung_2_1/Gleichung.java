package uebung_2_1;

public class Gleichung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double p = 10;
		double q = 2;
		
		
		double unterwurzel = ((p/2)*(p/2))-q;
		double ueberwurzel1 = ((-p/2)+Math.sqrt(unterwurzel));
		double ueberwurzel2 = ((-p/2)-Math.sqrt(unterwurzel));
		
		System.out.println("x1= "+ueberwurzel1+" und x2= "+ueberwurzel2 );
		
	}

}
