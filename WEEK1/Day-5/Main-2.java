/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	     System.out.print(f(5,3));
	}
	public static int f(int x,int y){
	    if(x==0 || y==0){
	        return 1;
	    }
	    return f(x-1,y)+f(x,y-1);
	}
}
//output is 56