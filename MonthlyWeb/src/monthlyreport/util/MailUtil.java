package monthlyreport.util;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;


import javax.mail.*;
import javax.mail.internet.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;

public class MailUtil {

	public static void sendHtmlMail(Properties mailProp,final String mailUser, final String mailPswd,String mailTo[],String mailCc[],String sender, String subject, String body) throws Exception{
		Session mailSess;
		mailSess = Session.getInstance(mailProp, new Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailUser, mailPswd);
			}
		});
		MimeMessage mimeMsg = new MimeMessage(mailSess);
		mimeMsg.setRecipients(MimeMessage.RecipientType.TO, toMailAddress(mailTo));
		if(mailCc != null && mailCc.length > 0){
			mimeMsg.setRecipients(MimeMessage.RecipientType.CC, toMailAddress(mailCc));
		}
		mimeMsg.setSubject(subject);
		mimeMsg.setContent(body, "text/html");
		mimeMsg.setSender(new InternetAddress(sender));
		Transport.send(mimeMsg);
		System.out.println("Send mail success");
	}
	
	public static void sendHtmlMail(Session mailSess,String mailTo[],String mailCc[],String sender, String subject, String body) throws Exception{
		MimeMessage mimeMsg = new MimeMessage(mailSess);
		mimeMsg.setRecipients(MimeMessage.RecipientType.TO, toMailAddress(mailTo));
		if(mailCc != null && mailCc.length > 0){
			mimeMsg.setRecipients(MimeMessage.RecipientType.CC, toMailAddress(mailCc));
		}
		mimeMsg.setSubject(MimeUtility.encodeText(subject,"UTF-8","Q"));
	//	mimeMsg.setSubject(subject);
		mimeMsg.setContent(body, "text/html; charset=UTF-8");
		mimeMsg.setSender(new InternetAddress(sender));
		Transport.send(mimeMsg);
	}
	
	public static void sendHtmlMailWithAttachment(Session mailSess,String mailTo[],String mailCc[],String sender, String subject, String body, List<BodyPart> attachList) throws Exception{
		MimeMessage mimeMsg = new MimeMessage(mailSess);
		mimeMsg.setRecipients(MimeMessage.RecipientType.TO, toMailAddress(mailTo));
		if(mailCc != null && mailCc.length > 0){
			mimeMsg.setRecipients(MimeMessage.RecipientType.CC, toMailAddress(mailCc));
		}
		mimeMsg.setSender(new InternetAddress(sender));
		mimeMsg.setSubject(MimeUtility.encodeText(subject,"UTF-8","Q"));
		Multipart multipart = new MimeMultipart();
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent(body, "text/html; charset=UTF-8");
		multipart.addBodyPart(messageBodyPart);
		for(BodyPart attach : attachList){
			multipart.addBodyPart(attach);
		}
		mimeMsg.setContent(multipart);
		Transport.send(mimeMsg);
	}
	
	public static InternetAddress[] toMailAddress(String mailAddr[]) throws Exception{
		InternetAddress[] addrList = new InternetAddress[mailAddr.length];
		int i = 0;
		for(String mail : mailAddr){
			addrList[i] = new InternetAddress(mail);
		}
		return addrList;
	}
	

	
	public static void main(String ...arg)throws Exception{
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp-relay.gmail.com");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.setProperty("mail.smtp.port", "465");
		prop.put("mail.smtp.socketFactory.port", "465");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		//prop.put("mail.smtp.starttls.enable", "true");
		MailUtil.sendHtmlMail(prop, "admin@hotum.co.th", "@dminH0tum",new  String[]{"rungrot@orcsoft.co.th"}, null, "admin@hotum.co.th", "test send email", "<h1>Test GSUITE SSL</h1>");
	}
	
}
