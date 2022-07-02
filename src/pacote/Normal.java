package uninter;

public class Normal extends Computador{
	
	Tabuleiro tab;
	
	public Normal(Tabuleiro tab) {
		super();
		this.tab = tab;
	}

	public void jogaNormal(){

		String escolha = "a1";
		
		if (escolha.equals("a1") && tab.a1.equals("O") || escolha.equals("a1") && tab.a1.equals("X")) { // Sequência das posições a serem marcadas
			escolha = "a3";
		}
		if (escolha.equals("a3") && tab.a3.equals("O") || escolha.equals("a3") && tab.a3.equals("X")) {
			escolha = "c3";
		}
		if (escolha.equals("c3") && tab.c3.equals("O") || escolha.equals("c3") && tab.c3.equals("X")) {
			escolha = "c1";
		} 
		if (escolha.equals("c1") && tab.c1.equals("O") || escolha.equals("c1") && tab.c1.equals("X")) {
			escolha = "a2";
		}
		if (escolha.equals("a2") && tab.a2.equals("O") || escolha.equals("a2") && tab.a2.equals("X")){
			escolha = "b2";	
		}
		if (escolha.equals("b2") && tab.b2.equals("O") || escolha.equals("b2") && tab.b2.equals("X")) {
			escolha = "b3";
		}
		if (escolha.equals("b3") && tab.b3.equals("O") || escolha.equals("b3") && tab.b3.equals("X")) {
			escolha = "b1";	
		}
		if (escolha.equals("b1") && tab.b1.equals("O") || escolha.equals("b1") && tab.b1.equals("X")) {
			escolha = "c2";
		}
		
		
		if (escolha.equals("a1")){
			tab.a1 = "O";
		}
		if (escolha.equals("a2")){
			tab.a2 = "O";
		}
		if (escolha.equals("a3")){
			tab.a3 = "O";
		}
		if (escolha.equals("b1")){
			tab.b1 = "O";
		}
		if (escolha.equals("b2")){
			tab.b2 = "O";
		}
		if (escolha.equals("b3")){
			tab.b3 = "O";
		}
		if (escolha.equals("c1")){
			tab.c1 = "O";
		}
		if (escolha.equals("c2")){
			tab.c2 = "O";
		}
		if (escolha.equals("c3")){
			tab.c3 = "O";
		}
		
	}
}

