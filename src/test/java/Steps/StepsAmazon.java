package Steps;

import Pages.HomePage;
import Pages.ResultadoDaBusca;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepsAmazon {
    WebDriver driver;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @io.cucumber.java.pt.Dado("que esteja na pagina: {string}")
    public void queEstejaNaPagina(String arg0) {
        driver.get(arg0);
    }

    @Quando("fazer busca pelo produto: {string}")
    public void fazerBuscaPeloProduto(String produto) {
        HomePage homePage = new HomePage(driver);
        homePage.realizaBusca(produto);
    }

    @Entao("verificar se o valor esta acima de: {string}")
    public void verificarSeOValorEstaAcimaDe(String valorProduto) {
        ResultadoDaBusca resultadoDaBusca = new ResultadoDaBusca(driver);
        resultadoDaBusca.clicarProduto();
        Assert.assertEquals(valorProduto, resultadoDaBusca.retornaValorIten());
    }
}
