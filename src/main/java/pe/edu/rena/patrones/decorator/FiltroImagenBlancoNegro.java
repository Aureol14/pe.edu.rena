package pe.edu.rena.patrones.decorator;

public class FiltroImagenBlancoNegro extends FiltroImagenBase{
	public FiltroImagenBlancoNegro(FiltroImagen filtroImagen) {
		super (filtroImagen);
	}
	public FiltroImagenBlancoNegro() {
		super ();
	}
	@Override
	protected Imagen filtroReal(Imagen imagen) {
		Imagen imagenFiltrada = new Imagen(imagen.getContenido()+" en blanco y negro");
		return imagenFiltrada;
	}
}
