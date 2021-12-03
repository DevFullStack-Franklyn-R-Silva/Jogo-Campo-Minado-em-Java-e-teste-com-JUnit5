package hadesfranklyn.com.github.cm;

import hadesfranklyn.com.github.cm.modelo.Tabuleiro;
import hadesfranklyn.com.github.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}