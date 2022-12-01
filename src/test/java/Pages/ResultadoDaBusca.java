package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoDaBusca {
    WebDriver driver;
    final String SELECIONA_ITEN = "//span[@class='a-size-base-plus a-color-base a-text-normal']";
    final String ITEN_PRECO = "//span[@class='a-price-whole']";
    public ResultadoDaBusca(WebDriver driver){
        this.driver = driver;
    }

    public void clicarProduto(){
        driver.findElement(By.xpath(SELECIONA_ITEN)).click();

    }
    public String retornaValorIten(){
        return driver.findElement(By.xpath(ITEN_PRECO)).getText();

    }
}
