package uninter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Easy extends Computador{
	
	Tabuleiro tab;
	
public Easy(Tabuleiro tab) {
		super();
		this.tab = tab;
	}

public void jogaEasy(){
	
	String sorteada;
	List<String> objetos = new ArrayList<String>();
	objetos.add("a1");
	objetos.add("a2");
	objetos.add("a3");
	objetos.add("b1");
	objetos.add("b2");
	objetos.add("b3");
	objetos.add("c1");
	objetos.add("c2");
	objetos.add("c3");

	Random random = new Random();
	sorteada = objetos.get(random.nextInt(objetos.size())); // Inclui na variável sorteada um objeto aleatório

		
		if (sorteada.equals("a1") && tab.a1.equals("O") || sorteada.equals("a1") && tab.a1.equals("X")) { // Se a posição sorteada já estiver marcada no tabuleiro, chama a função de novo
			jogaEasy();
		}
		else if (sorteada.equals("a1")) {
			 tab.a1 = "O";
		} 
		else if (sorteada.equals("a2") && tab.a2.equals("O") || sorteada.equals("a2") && tab.a2.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "a2"){
			tab.a2 = "O";	
		}
		else if (sorteada.equals("a3") && tab.a3.equals("O") || sorteada.equals("a3") && tab.a3.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "a3"){
			tab.a3 = "O";	
		}
		else if (sorteada.equals("b1") && tab.b1.equals("O") || sorteada.equals("b1") && tab.b1.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "b1"){
			tab.b1 = "O";	
		}
		else if (sorteada.equals("b2") && tab.b2.equals("O") || sorteada.equals("b2") && tab.b2.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "b2"){
			tab.b2 = "O";	
		}
		else if (sorteada.equals("b3") && tab.b3.equals("O") || sorteada.equals("b3") && tab.b3.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "b3"){
			tab.b3 = "O";	
		}
		else if (sorteada.equals("c1") && tab.c1.equals("O") || sorteada.equals("c1") && tab.c1.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "c1"){
			tab.c1 = "O";	
		}
		else if (sorteada.equals("c2") && tab.c2.equals("O") || sorteada.equals("c2") && tab.c2.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "c2"){
			tab.c2 = "O";	
		}
		else if (sorteada.equals("c3") && tab.c3.equals("O") || sorteada.equals("c3") && tab.c3.equals("X")) {
			jogaEasy();
		}
		else if (sorteada == "c3"){
			tab.c3 = "O";	
		}
		
		
	}
	
		
}

