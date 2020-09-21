package com.JavaLogHello;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 

public class App 
{
	private static final Logger Log=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	
    	String message="Hello World!!!";
    	Log.debug(message+" Debug Message");
    	Log.info(message+" Info Message");
    	Log.warn(message+" Warn Message");
    	Log.error(message+" Error Message");
    	Log.fatal(message+" Fatal Message");
        System.out.println( message );
	System.out.println("GOODBYE!!!, AND TAKE CARE");
    }
}
