public class Caulate{
	public static void main(String[] args){
		/*page 30-1*/
		System.out.println("34+30 = "+34+30);
		/*page 30-2*/
		int count = 10;
		count *= count+2;
		count /= 100;
		count ++;
		System.out.printf("  count = %d  ",count);
		/*page 30-3*/
		int res,n1 = 12,n2 = 24,n3 = 16,n4 = 3;
		double d,v1 = 10.0,v2 = 3.1416;
		res = n1/n4;
		System.out.printf("  res = %d  ",res);
		
		d = n1/n4;
		System.out.printf("  d = %.2f  ",d);
		
		res = n3/n4;
		System.out.printf("  res = %d  ",res);
		
		d = n3/n4;
		System.out.printf("  d = %.2f  ",d);
		
		d = v1/n4;
		System.out.printf("  d = %.2f  ",d);
		
		d = v1/v2;
		System.out.printf("  d = %.2f  ",d);
		
		res = n1/n2;
	    System.out.printf("  res = %d  ",res);
		
		d = (double)n1/n2;
		System.out.printf("  d = %.2f  ",d);
		
		d = n1/(double)n2;
		System.out.printf("  d = %.2f  ",d);
		
		d = (double)(n1/n2);
		System.out.printf("  d = %.2f  ",d);
	}
}
