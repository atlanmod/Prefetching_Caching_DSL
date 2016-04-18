package fr.inria.atlanmod.prefetch.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrefetchLogger {

	public static final Level SEVERITY_ERROR = Level.ERROR;
	public static final Level SEVERITY_INFO= Level.INFO;
	public static final Level SEVERITY_WARNING = Level.WARN;
	public static final Level SEVERITY_DEBUG = Level.DEBUG;
	
    private static Logger log = LogManager.getRootLogger();
    
    public static void log(Level severity, Throwable e) {
        log.log(severity,
        		e.getMessage() != null ? e.getMessage() : e.toString(), e);
    }

    public static void log(Level severity, String msg, Throwable e) {
    	log.log(severity, msg, e);
    }
    
    public static void log(Level severity, String msg) {
        log.log(severity, msg);
    }
    
    public static void info(Throwable e) {
    	log(SEVERITY_INFO,e);
    }
    
    public static void info(String msg) {
    	log(SEVERITY_INFO,msg);
    }
    
    public static void error(Throwable e) {
    	log(SEVERITY_ERROR,e);
    }
    
    public static void error(String msg) {
    	log(SEVERITY_ERROR,msg);
    }
    
    public static void warn(Throwable e) {
    	log(SEVERITY_WARNING,e);
    }
    
    public static void warn(String msg) {
    	log(SEVERITY_WARNING,msg);
    }
    
    public static void debug(Throwable e) {
    	log(SEVERITY_WARNING,e);
    }
    
    public static void debug(String msg) {
    	log(SEVERITY_DEBUG,msg);
    }
	    
}
