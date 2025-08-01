/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	     System.out.print(f(2,7));
	}
	public static int f(int x,int y){
	    if(x==y){
	        return x*y;
	    }
	    return f(x,(x+y)/2)+f((x+y)/2+1,y);
	}
}
//output is 139