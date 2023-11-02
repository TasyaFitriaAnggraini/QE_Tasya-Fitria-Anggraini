package starter.Web;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Category extends PageObject {
    private By category() {
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[1]/div[3]");
    }
    private By product() {
        return By.xpath("/html/body/div/div[2]/div/div[1]/div/div");
    }
    private By clearCategory() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[2]/div/button");
    }
    @Step
    public static OpenUrl url(String targeturl) {
        return new OpenUrl();
    }
    @Step
    public void listCategory(){
        $(category()).click();
    }
    @Step
    public void clickProductCategory(){
        $(product()).click();
    }
    @Step
    public void clickTheClearCategory() {
        $(clearCategory()).click();
    }
}
