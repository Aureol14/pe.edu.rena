package pe.edu.rena.patrones.decorator;

public class PrincipalDecorator {
	public static void main(String[] args) {
		Imagen img1 = new Imagen("rostro");
		
		FiltroImagen filtroBN = new FiltroImagenBlancoNegro();
		
		FiltroImagen filtroOld = new FiltroImagenEnvejecedor();		
	
		FiltroImagen filtroCombinado = new FiltroImagenBlancoNegro(filtroOld);
		
		FiltroImagen filtroX = new FiltroImagenBlancoNegro(
				new FiltroImagenEnvejecedor(
						new FiltroImagenBlancoNegro()
						)
				);
		
		
		Imagen imgBN = filtroBN.filtrar(img1);
		System.out.println(imgBN.getContenido());
		Imagen imgOld = filtroOld.filtrar(img1);
		System.out.println(imgOld.getContenido());
		Imagen imgCombinada = filtroCombinado.filtrar(img1);
		System.out.println(imgCombinada.getContenido());
		
		
		
		System.out.println(filtroX.filtrar(img1).getContenido());
	}
}
