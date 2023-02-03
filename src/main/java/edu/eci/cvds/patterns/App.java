package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	if(args.length > 0){
        System.out.print("Hello ");
        for(int i = 0; i < args.length;i++){
            if(i < args.length-1) System.out.print(args[i]+ " ");
            else System.out.print(args[i]+ "!" + "\n");
        }
    }
	else System.out.println("Hello World!");
    }
}