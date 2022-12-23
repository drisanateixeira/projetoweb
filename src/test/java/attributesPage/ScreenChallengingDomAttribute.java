package attributesPage;
import org.openqa.selenium.By;

public class ScreenChallengingDomAttribute {

	protected int variavel;
	
	protected static final By quxBotao = By.xpath("//*[@class='button']");
	protected static final By barBotao = By.xpath("//*[contains(@class, 'button alert')]");
	protected static final By quxSuccessBotao = By.xpath("//a[contains(@class, 'button success')]");


}
