import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "happiebeachbum@gmail.com";
	static final String FAKE_PASSWORD = "sanclementeca";

	public static void main(String[] args) {
		Spamalot spam = new Spamalot();
		spam.Spam();

	}

	JButton bad = new JButton();
	JButton good = new JButton();
	JTextField text = new JTextField(13);

	public void Spam() {
		JFrame frame = new JFrame();
		frame.setSize(400, 90);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		panel.add(text);
		panel.add(bad);
		panel.add(good);
		bad.setText("BAD");
		good.setText("GOOD");

		bad.addActionListener(this);
		good.addActionListener(this);
		text.addActionListener(this);
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	String sendTextMessage(String phoneNumber, String message) {
		if (sendSpam(phoneNumber + "@tmomail.net", "", message))
			return "T-Mobile";
		if (sendSpam(phoneNumber + "@vmobl.com", "", message))
			return "Virgin Mobile";
		if (sendSpam(phoneNumber + "@cingularme.com", "", message))
			return "Cingular";
		if (sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message))
			return "Sprint";
		if (sendSpam(phoneNumber + "@vtext.com", "", message))
			return "Verizon";
		if (sendSpam(phoneNumber + "@messaging.nextel.com", "", message))
			return "Nextel";
		return "FAIL!";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String email = text.getText();
		System.out.println(email);
		String subject = null;
		System.out.println(subject);
		String message = null;
		System.out.println(message);
		boolean sent = false;

		if (e.getSource() == bad) {
			message = "you're annoying  and creppy EW";
			subject = "you suck !!";
			sent = sendSpam(email, subject, message);
		} else if (e.getSource() == good) {
			message = "you're smart and nice hmu (:";
			subject = "you are amazeballs";
			sent = sendSpam(email, subject, message);

		}
		if (sent == true) {
			text.setBackground(Color.GREEN);

		} else {
			text.setBackground(Color.RED);

		}
	}

}
