package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import pageObjects.ScreenChallengingDomPage;
import utils.Browser;

public class ScreenChallengingDomStep extends Browser {
	ScreenChallengingDomPage screen = new ScreenChallengingDomPage(driver);
	 
		@Dado("que acesso o site {string}")
		public void accessURL(String url) {
			screen.getURL(url);
		}
		
		@Quando("clicar nos botoes que apresentam na tela")
		public void clicaBotao() {
			screen.procurarBotao();
		}
		
		@Entao("clique em todos os botões da tabela de editar e deletar")
		public void cliqueEditeDelete() {
			screen.editarDezVezes();
			screen.deletarDezVezes();
			
		}
		 
	 
}
