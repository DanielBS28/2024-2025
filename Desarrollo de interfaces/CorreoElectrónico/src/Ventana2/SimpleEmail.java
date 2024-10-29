package Ventana2;

import java.util.Properties;

import javax.mail.*;

public class SimpleEmail {

	/*
	 * Outgoing mail smtp server requires tls or ssl smtp.gmail.com (ssl) use
	 * autentificacion ssl port 465
	 */

	public static void EnviarEmail(String enviarAcorreo, String asuntoCorreo, String body) {
		final String fromEmail = "cuentacoces2@gmail.com"; // email de salida
		final String password = "humu gius pmmc zekx";// contraseña del email de salida
		final String toEmail = enviarAcorreo; // email destinatario

		System.out.println("Configurando datos conexión SSL");

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // smtp de gmail en este caso
		props.put("mail.smtp.socketFactory.class", "465"); // puerto SSL
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // SSL Factory Class
		props.put("mail.smtp.auth", "true");// activar smtp autentificación
		props.put("mail.smtp.port", "465");// smtp port

		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};

		Session session = Session.getDefaultInstance(props, auth);
		System.out.println("Sesión Creada");

		/*
		 * Llamada al metodo send email con todos los datos configurados session toemail
		 * subject body
		 */

		EmailUtil.sendEmail(session, toEmail, asuntoCorreo, body);

	}

}
