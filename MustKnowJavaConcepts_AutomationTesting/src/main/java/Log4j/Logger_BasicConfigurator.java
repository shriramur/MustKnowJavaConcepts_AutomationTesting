package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_BasicConfigurator {

	static Logger logger = Logger.getLogger(Logger_BasicConfigurator.class);//Factory design pattern method to create logger object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");

	}

}
