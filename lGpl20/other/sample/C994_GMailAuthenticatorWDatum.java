package lGpl20.other.sample;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * To send gmail.<br/>
 * To send gmail.
 * 
 * @version 2018/11/23_16:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C994_GMailAuthenticatorWDatum" >
 *          C994_GMailAuthenticatorWDatum.java</a>
 * 
 * @see C995_ThrToSendGMail
 */
public class C994_GMailAuthenticatorWDatum extends Authenticator {

	public String sId;
	public String sPassword;

	public String sTo;

	public String sSubject;
	public String sText;

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {

		return new PasswordAuthentication(sId, sPassword);

	}

}