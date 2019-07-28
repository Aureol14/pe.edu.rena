package pe.edu.rena.patrones.decorator;

public abstract class FiltroImagenBase implements FiltroImagen {
	protected FiltroImagen filtroImagen;

	public FiltroImagenBase() {
		this(new FiltroImagenVacio());
	}

	public FiltroImagenBase(FiltroImagen filtroImagen) {
		if (filtroImagen != null) {
			this.filtroImagen = filtroImagen;
		}
		else
			this.filtroImagen = new FiltroImagenVacio();
	}

	@Override
	public Imagen filtrar(Imagen imagen) {
		Imagen imagenFiltrada = filtroImagen.filtrar(imagen);
		return filtroReal(imagenFiltrada);
	}
	protected abstract Imagen filtroReal(Imagen imagen);
}
