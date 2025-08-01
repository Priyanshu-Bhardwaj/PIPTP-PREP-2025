/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     f(1);
	}
	public static void f(int x){
	    if(x==1){
	        System.out.print(1+" ");
	        return;
	    }
	   f(x-1);
	   System.out.print(x+" ");
	   f(x-1);
	}
}
