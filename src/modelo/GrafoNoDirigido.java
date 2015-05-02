package modelo;

import java.util.ArrayList;

public class GrafoNoDirigido extends Grafo {

	public GrafoNoDirigido(Integer nNodos, Double porcentajeArcos) {
		super(nNodos, porcentajeArcos);
		// TODO Auto-generated constructor stub
	}
	
	
	/** A�ade un nuevo arco no dirigido a la matriz de adyacencia.
	 * 
	 * @param nodo1	Nodo a un extremo del arco.
	 * @param nodo2	Nodo al otro extremo del arco.
	 * @param valorArco	Valor que tendr� el arco. */
	@Override
	protected void addArco(Integer nodo1, Integer nodo2, int valorArco) {
		matrizDeAdyacencia[nodo1][nodo2] = valorArco;
		matrizDeAdyacencia[nodo2][nodo1] = valorArco;
	}
	
	
	protected void construirArcosExtra(Double porcentajeDeArcos){
		//Almacenar en una lista los arcos no existentes
		ArrayList<Arco> arcosNoExistentes = new ArrayList<Arco>();
		for(int i = 0; i < matrizDeAdyacencia.length; i++){
			for(int j = 0; j < i; j++){
				if(matrizDeAdyacencia[i][j].equals(0)){
					arcosNoExistentes.add(new Arco(i, j));
				}
			}
		}
		
		anadirArcosAlAzarDeLaLista(arcosNoExistentes, porcentajeDeArcos);
	}
	
	
	@Override
	public String toString(){
		return (super.toString() + "\n(grafo no dirigido)");
	}
	
	
}
