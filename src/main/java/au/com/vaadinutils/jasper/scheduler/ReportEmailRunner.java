package au.com.vaadinutils.jasper.scheduler;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Date;

import javax.mail.internet.AddressException;

import org.apache.commons.mail.EmailException;

import au.com.vaadinutils.jasper.JasperEmailSettings;

public interface ReportEmailRunner
{

	/**
	 * 
	 * @param schedule
	 * @param scheduleTime
	 * @param emailSettings
	 * @return true if the report was run, false if the system is busy and the
	 *         report should be tried again later
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws EmailException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws AddressException
	 * @throws ClassNotFoundException
	 * @throws URISyntaxException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 */
	public boolean runReport(ReportEmailSchedule schedule, Date scheduleTime, JasperEmailSettings emailSettings)
			throws InterruptedException, IOException, EmailException, InstantiationException, IllegalAccessException,
			AddressException, ClassNotFoundException, URISyntaxException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException;

}
