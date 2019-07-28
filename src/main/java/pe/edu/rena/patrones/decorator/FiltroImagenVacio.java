package pe.edu.rena.patrones.decorator;

/**
 * Este filtro no aplica ningun cambio a la imagen
 * @author Renato
 *
 */
public class FiltroImagenVacio implements FiltroImagen{
@Override
public Imagen filtrar(Imagen imagen) {
	return imagen;
}
}
