package monthlyreport.Controller;


import monthlyreport.util.MailTemplate;
import monthlyreport.util.MailUtil;
import org.springframework.scheduling.annotation.Async;



import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;

import java.io.File;
import java.util.List;
import java.util.Properties;

public class MailSenderAsync {

  /*  @Autowired
    Logger log;*/


    @Async
    public void setMailWithAttachment(Session mailSess, MailTemplate mailTemp,
                                      List<BodyPart> attachList) {
        try {
            long strtTime = System.currentTimeMillis();
            /*log.info(":sending email with attachment[" + attachList.size() + "]");*/
            MailUtil.sendHtmlMailWithAttachment(mailSess, mailTemp.getMailTOArr(), mailTemp.getMailCCArr(),
                    mailTemp.getMailSender(), mailTemp.getSubject(), mailTemp.getBodyMssg(), attachList);
           /* log.info("send mail with attachment[" + attachList.size() + "] success, time use:"
                    + (System.currentTimeMillis() - strtTime) + " ms.");*/
        } catch (Exception e) {

        }
    }

    @Async  
    public  void sendEmail(Session mailSess,String mailTo[],String mailCc[],String sender, String subject, String body, String attachFiles[]) throws Exception {
    	System.out.println("MyEmail5555555"+mailTo);
    	System.out.println("FileFromurl"+attachFiles);
		MimeMessage mimeMsg = new MimeMessage(mailSess);
		mimeMsg.setRecipients(MimeMessage.RecipientType.TO, toMailAddress(mailTo));
		if(mailCc != null && mailCc.length > 0){
			mimeMsg.setRecipients(MimeMessage.RecipientType.CC, toMailAddress(mailCc));
		}
		mimeMsg.setSubject(MimeUtility.encodeText(subject,"UTF-8","Q"));

		mimeMsg.setContent(body, "text/html; charset=UTF-8");
		mimeMsg.setSender(new InternetAddress(sender));

		///////////////////////////////////////////////
		    MimeBodyPart messageBodyPart = new MimeBodyPart();
	        messageBodyPart.setText("Hello Hotum, Please do not reply this mail");

	        Multipart multipart = new MimeMultipart();
	        multipart.addBodyPart(messageBodyPart);

	        
	         for(int i=0;i<attachFiles.length;i++){
	        	 System.out.println("My File"+attachFiles[i]);
	        	messageBodyPart = new MimeBodyPart();
	  	        DataSource source = new FileDataSource(attachFiles[i]);
	  	        messageBodyPart.setDataHandler(new DataHandler(source));
	  	        messageBodyPart.setFileName(attachFiles[i]);
	  	        multipart.addBodyPart(messageBodyPart);
	  	        mimeMsg.setContent(multipart);
	         }
	         
		Transport.send(mimeMsg);
	    System.out.println("Send mail success");
	    
	    
	/*    File file = new File("C:\\test\\");
	    
        if (file.isDirectory()) {
            if (file.list().length > 0) {
                System.out.println("Directory is not empty!");
                removeFile();
            } else {
                System.out.println("Directory is empty!");
            }
        } else {
            System.out.println("This is not a directory");
        }
		*/
	 

    }


	public void removeFile() {
		File folder =new File("C:\\test\\");
			if(folder.exists() && folder.isDirectory()){

				for (File f : folder.listFiles()) {
					if(f.delete()){
						System.out.println("'"+f.getName()+"' deleted successfully");
					}else{
						System.out.println("Fail to delete '"+f.getName()+"'");
					}
				}
			}
	}

    public static void sendEmaill(Properties mailProp,final String mailUser, final String mailPswd,String mailTo[],String mailCc[],String sender, String subject, String body) throws Exception{
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
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText("Hello mr.win, Please do not reply this mail");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        String  Attach = "C:\\test\\SeperateIncome.xls";
        // Part two is attachment
        messageBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(Attach);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName("SeperateIncome.xls");
        multipart.addBodyPart(messageBodyPart);

        mimeMsg.setContent(multipart);
        Transport.send(mimeMsg);
        System.out.println("Send mail success");

    }

    public static InternetAddress[] toMailAddress(String mailAddr[]) throws Exception{
        InternetAddress[] addrList = new InternetAddress[mailAddr.length];
        int i = 0;
        for(String mail : mailAddr){
            addrList[i] = new InternetAddress(mail);
        }
        return addrList;
    }



}
