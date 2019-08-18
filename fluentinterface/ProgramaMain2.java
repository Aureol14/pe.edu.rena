package pe.edu.rena.fluentinterface;

public class ProgramaMain2 {
	public static void main(String[] args) {
		MailProperties p = new MailProperties();
		p.setCorreo("prueba@prueba.com").setTitulo("hola").setMensaje("hola q tal");
		System.out.println(p.getCorreo());
		System.out.println(p.getTitulo());
		System.out.println(p.getMensaje());
	}
}
