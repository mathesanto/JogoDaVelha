package uninter;

public class Hardcore extends Computador{
	
	Tabuleiro tab;
	
	public Hardcore(Tabuleiro tab) {
		super();
		this.tab = tab;
	}

	public void jogaHardcore(){
			
		String escolha = "jogada1";

		if(escolha.equals("jogada1") && !tab.a3.equals("O")){ // Dá um "checkmate" no humano
			tab.a3 = "O";
			tab.c1 = "O";
			tab.c3 = "O";
		}
		if(tab.b3.equals("O") || tab.b3.equals("X")) {
			tab.c2 = "O";
		}else if (tab.c2.equals("O") || tab.c2.equals("X")){
			tab.b3 = "O";
		}else if(tab.a1.equals("X") || tab.a2.equals("X") || (tab.b1.equals("X") || tab.b2.equals("X"))){
			tab.b3 = "O";
		}
	
	}
}
