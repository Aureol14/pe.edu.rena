package pe.edu.rena.patrones.decorator;

public class FiltroImagenEnvejecedor extends FiltroImagenBase {
	public FiltroImagenEnvejecedor(FiltroImagen filtroImagen) {
		super(filtroImagen);
	}

	public FiltroImagenEnvejecedor() {
		super();
	}

	@Override
	protected Imagen filtroReal(Imagen imagen) {
		Imagen imagenconRostroDetectado = detectarRostro(imagen);
		Imagen imagenFiltrada = new Imagen(imagenconRostroDetectado.getContenido() + " Con rostros envejecidos");
		return imagenFiltrada;
	}

	private Imagen detectarRostro(Imagen imagen) {
		System.out.println("Detectando rostros");
		return imagen;
	}
}
