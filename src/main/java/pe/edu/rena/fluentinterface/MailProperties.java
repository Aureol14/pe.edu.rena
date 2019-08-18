package pe.edu.rena.fluentinterface;

import java.util.Properties;

public class MailProperties {
	private Properties properties = new Properties();

	public MailProperties setCorreo(String valor) {// setter
		properties.setProperty("correo", valor);
		return this;
	}

	public String getCorreo() {// getter
		return properties.getProperty("correo");
	}

	public MailProperties setTitulo(String valor) {
		properties.setProperty("titulo", valor);
		return this;
	}

	public String getTitulo() {
		return properties.getProperty("titulo");
	}

	public MailProperties setMensaje(String valor) {
		properties.setProperty("mensaje", valor);
		return this;
	}

	public String getMensaje() {
		return properties.getProperty("mensaje");
	}

}
