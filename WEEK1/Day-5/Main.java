/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println(recur(6));
		System.out.println(recur(5));
		System.out.println(recur(4));
		System.out.println(recur(3));
		
	}
	public static int recur(int n){
	    if(n<=1){
	        return n;
	    }
	    if(n>1 && n%2==0){
	        return n+recur(n/2);
	    }
	    else{
	        return recur((n+1)/2) + recur((n-1)/2);
	    }
	}
}