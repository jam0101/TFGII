package interfaz.pestanaDePregunta;

import interfaz.AreaPreguntas;
import interfaz.FramePrincipal;
import interfaz.PanelCentral;

import javax.swing.JTabbedPane;

import modelo.pregunta.Pregunta;
import modelo.pregunta.PreguntaDeKruskal_ArcosDelArbolDeExpansion;
import modelo.pregunta.PreguntaDeKruskal_OrdenDeSeleccion;
import modelo.pregunta.PreguntaDePrim;
import texto.Texto;
import texto.Textos_Preguntas;

@SuppressWarnings("serial")
public class PestanaDePreguntaDeKruskal extends PestanaDePregunta {

	public PestanaDePreguntaDeKruskal(JTabbedPane panelTabulado, Texto nombreDeLaPestana,
			int teclaMnemotecnica, AreaPreguntas areaPreguntas, FramePrincipal frame, PanelCentral panelCentral) {
		super(panelTabulado, nombreDeLaPestana, teclaMnemotecnica, areaPreguntas, frame, panelCentral);

//		deshabilitarGrafoDirigido(false);
		setVisibleTipoPregunta(true);
		addTipoPregunta(Textos_Preguntas.tipoPregunta_ArcosDelArbolDeExpansion());
		addTipoPregunta(Textos_Preguntas.tipoPregunta_OrdenDeSeleccion());
	}

	@Override
	protected Pregunta generarPregunta() {
		switch(getTipoDePregunta()){
		case PreguntaDePrim.PREGUNTA_ARCOS_DEL_ARBOL_DE_EXPANSION:
			return new PreguntaDeKruskal_ArcosDelArbolDeExpansion(	panelCentral.getNumNodos(),
																	panelCentral.getPorcentajeArcos(),
																	panelCentral.getVisualizacionGrafo());
		case PreguntaDePrim.PREGUNTA_ORDEN_DE_SELECCION: default:
			return new PreguntaDeKruskal_OrdenDeSeleccion(	panelCentral.getNumNodos(),
																	panelCentral.getPorcentajeArcos(),
																	panelCentral.getVisualizacionGrafo());
		}
	}

}
