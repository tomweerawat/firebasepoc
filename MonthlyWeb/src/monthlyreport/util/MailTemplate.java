package monthlyreport.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class MailTemplate implements Serializable {

	private static final long serialVersionUID = 1L;

	private String subject;
	private String bodyMssg;
	private String bodyContentType;
	private List<String> attachFileList;
	private List<String> mailTO;
	private List<String> mailCC;
	private List<String> mailBCC;
	private String mailSender;
	
	public MailTemplate(){
		super();
		attachFileList = new ArrayList<>();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyMssg() {
		return bodyMssg;
	}

	public void setBodyMssg(String bodyMssg) {
		this.bodyMssg = bodyMssg;
	}

	public String getBodyContentType() {
		return bodyContentType;
	}

	public void setBodyContentType(String bodyContentType) {
		this.bodyContentType = bodyContentType;
	}

	public List<String> getAttachFileList() {
		return attachFileList;
	}

	public void setAttachFileList(List<String> attachFileList) {
		this.attachFileList = attachFileList;
	}


	public String getMailSender() {
		return mailSender;
	}

	public void setMailSender(String mailSender) {
		this.mailSender = mailSender;
	}

	public List<String> getMailTO() {
		return mailTO;
	}
	
	public String[] getMailTOArr(){
		return mailTO==null?null:mailTO.toArray(new String[0]);
	}

	public void setMailTO(List<String> mailTO) {
		this.mailTO = mailTO;
	}

	public List<String> getMailCC() {
		return mailCC;
	}
	
	public String[] getMailCCArr(){
		return mailCC==null?null:mailCC.toArray(new String[0]);
	}

	public void setMailCC(List<String> mailCC) {
		this.mailCC = mailCC;
	}

	public List<String> getMailBCC() {
		return mailBCC;
	}

	public void setMailBCC(List<String> mailBCC) {
		this.mailBCC = mailBCC;
	}
	
	public String[] getMailBCCArr(){
		return mailBCC==null?null:mailBCC.toArray(new String[0]);
	}


}
