package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logger_XMLFileConfigurator {

	static Logger logger = Logger.getLogger(Logger_XMLFileConfigurator.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("C:\\Users\\ram\\workspace\\MustKnowJavaConcepts_AutomationTesting\\src\\main\\java\\Log4j\\log4j_xmlFileConfigurator.xml");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");

	}

}
