public class Main
{
	public static void main(String[] args) {
	    System.out.println(recur(123));
	     System.out.print(recur(55));
	
		
	}
	public static int recur(int n){
	    if(n<=0){
	        return 0;
	    }
	    return n%10 +recur(n/10);
	}
}