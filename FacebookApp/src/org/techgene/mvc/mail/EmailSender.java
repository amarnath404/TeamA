package org.techgene.mvc.mail;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class EmailSender {
	
	public void sendEmail(String host, String port, String userName,
			String password, String toAddress, String subject, String message,
			String[] attachFiles) throws AddressException, MessagingException {
		// sets SMTP properties
		Properties properties = new Properties();
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.user", userName);
		properties.put("mail.password", password);
		// creates a new session with an authenticator
		Authenticator auth = new SMTPAuthenticator(userName, password);
		Session session = Session.getInstance(properties, auth);
		// creates a new e-mail message
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(userName));
		InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		// creates message part
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent(message, "text/html");
		// creates multi-part
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);
		// adds attachments
		if (attachFiles != null && attachFiles.length > 0) {
			for (String filePath : attachFiles) {
				addAttachment(multipart, filePath);
			}
		}
		// sets the multi-part as e-mail's content
		msg.setContent(multipart);
		// sends the e-mail
		Transport.send(msg);
		System.out.println("Message sent sucesfully...");
	}

	
	private void addAttachment(Multipart multipart, String filePath)
			throws MessagingException {
		MimeBodyPart attachPart = new MimeBodyPart();
		DataSource source = new FileDataSource(filePath);
		attachPart.setDataHandler(new DataHandler(source));
		attachPart.setFileName(new File(filePath).getName());
		multipart.addBodyPart(attachPart);
	}

	

	private class SMTPAuthenticator extends javax.mail.Authenticator {
		private String userName;
		private String password;
		
		public SMTPAuthenticator(String userName, String password) {
			this.userName = userName;
			this.password = password;

		}

		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(userName, password);
		}
	}
}

