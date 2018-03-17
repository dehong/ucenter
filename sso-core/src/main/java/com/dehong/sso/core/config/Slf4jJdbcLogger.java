package com.dehong.sso.core.config;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Supplier;
import java.util.logging.Level;

import org.seasar.doma.jdbc.AbstractJdbcLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jJdbcLogger extends AbstractJdbcLogger<Level>
{
	protected static Logger defaultLogger = LoggerFactory.getLogger("doma");
	
    public Slf4jJdbcLogger()
    {
        this(Level.INFO);
    }
    
    public Slf4jJdbcLogger(Level level)
    {
        super(level);
    }

    @Override
    protected void log(Level level, String callerClassName, String callerMethodName, Throwable throwable, Supplier<String> messageSupplier)
    {
        Logger logger = LoggerFactory.getLogger(callerClassName);
        logger = defaultLogger;
        String msg = messageSupplier.get();
        
        if(level.intValue() == Level.INFO.intValue())
        {
            logger.info("{} {}", msg, getStackTrace(throwable));
        }
        else if(level.intValue() == Level.WARNING.intValue())
        {
            logger.warn("{} {}", msg, getStackTrace(throwable));
        }
        else if(level.intValue() == Level.SEVERE.intValue())
        {
            logger.error("{} {}", msg, getStackTrace(throwable));
        }
        else if(level.intValue() == Level.FINE.intValue())
        {
            logger.debug("{} {}", msg, getStackTrace(throwable));
        }
        else if(level.intValue() == Level.FINER.intValue())
        {
            logger.debug("{} {}", msg, getStackTrace(throwable));
        }
        else if(level.intValue() == Level.FINEST.intValue())
        {
            logger.trace("{} {}", msg, getStackTrace(throwable));
        }
    }
    
    public String getStackTrace(Throwable t)
    {
        if(t == null)
            return "";
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        pw.close();
        
        return sw.toString();
    }
}
