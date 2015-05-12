package interfaz;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import util.Idioma;
import util.Texto;

@SuppressWarnings("serial")
public class BarraMenu extends JMenuBar{
	
	private Idioma idioma;
	private final JMenu menuArchivo;
	private final JMenu menuAyuda;
	
	
	/** Constructor de la clase */
	public BarraMenu(Idioma idioma){
		this.idioma = idioma;
		//Men� > Archivo
		menuArchivo = new JMenu();
		menuArchivo.setText(Texto.menuArchivo().getString(idioma));
		add(menuArchivo);
		
		//Men� > Ayuda
		menuAyuda = new JMenu();
		menuAyuda.setText(Texto.menuAyuda().getString(idioma));
		add(menuAyuda);
	}
	
	
	/** Reescribe los textos tras cambiar la configuraci�n del idioma */
	public void reescribirTextos(){
		menuArchivo.setText(Texto.menuArchivo().getString(idioma));
		menuAyuda.setText(Texto.menuAyuda().getString(idioma));
	}
}
