package ListaComSentinela;

public class ListaEncadeadaSentinela<T> {

	private No<T> sentinela;
	private int tamanho;
	
	public ListaEncadeadaSentinela(){

		this.sentinela = new No();
		sentinela.item = (T) "Nulo";
		tamanho = 0;
	}
	
	public void add(T item){
		
		No<T> novoNo = new No();
		novoNo.item = item;
		if(eVazio()){
			
			novoNo.ant = sentinela;
			novoNo.prox = sentinela;
			sentinela.prox = novoNo;
			sentinela.ant = novoNo;
			
			tamanho++;

		}else{
			
			novoNo.ant = sentinela.ant;
			novoNo.prox = sentinela;
			sentinela.ant.prox = novoNo;
			sentinela.ant = novoNo;
			
			tamanho++;
			
		}
		
		
		
	}
	public boolean eVazio(){
		if(sentinela.ant == null && sentinela.prox == null){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		
		String a = "";
		No<T> sent = sentinela.prox;

		while(sent.item != "Nulo"){
	
			a+="{ "+sent.item+" } ";
			sent = sent.prox;
		}
		return (String) a;
	}
	public int tamanho(){
		return this.tamanho;
	}
	
	public T remover(int index){
		
		int cont = 1;
		No<T> aux = sentinela.prox;
		while(aux.item != "Nulo"){
			if(index == cont){
				aux.ant.prox = aux.prox;
				tamanho--;
				break;
			}else{
				cont++;
				aux = aux.prox;
			}
		}
		return aux.item;
	}
}
