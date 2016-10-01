package ListaComSentinela;

public class No<T> {

	protected No<T> prox;
	protected No<T> ant;
	T item;

	public No(){
		prox = null;
		ant = null;
		item = null;
	}
}
