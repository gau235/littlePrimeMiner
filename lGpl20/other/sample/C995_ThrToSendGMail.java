package lGpl20.other.sample;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import lGpl20.o.O;
import lGpl20.o.time.T64;

/**
 * To send gmail.<br/>
 * To send gmail.
 * 
 * @version 2019/01/24_09:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C995_ThrToSendGMail" >C995_ThrToSendGMail
 *          .java</a>
 * 
 * @see C994_GMailAuthenticatorWDatum
 */
public class C995_ThrToSendGMail extends Thread {

	public C994_GMailAuthenticatorWDatum c994_GMailAuthenticatorWDatum;

	@Override
	public void run() {

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, c994_GMailAuthenticatorWDatum);

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mail@companyxyz.com", "Company XYZ"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(c994_GMailAuthenticatorWDatum.sTo));

			message.setSubject(c994_GMailAuthenticatorWDatum.sSubject);
			message.setText(c994_GMailAuthenticatorWDatum.sText);

			Transport.send(message);

			O.l(message.getContent().toString().substring(0, 20) + " sent at " + T64.timeStr());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// how to use this:
	// public static void main(String[] sAry) throws Throwable {
	//
	// C994_GMailAuthenticatorWDatum c994_GMailAuthenticatorWDatum = new C994_GMailAuthenticatorWDatum();
	//
	// c994_GMailAuthenticatorWDatum.sPassword = ;
	//
	// c994_GMailAuthenticatorWDatum.sSubject = ;
	// c994_GMailAuthenticatorWDatum.sText = ;
	//
	// C995_ThrToSendGMail C995_ThrToSendGMail = new C995_ThrToSendGMail();
	//
	// C995_ThrToSendGMail.c994_GMailAuthenticatorWDatum = c994_GMailAuthenticatorWDatum;
	//
	// C995_ThrToSendGMail.start();
	//
	// }

}