package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// POM : Page Object Model
public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;



    public void findAndSend(String strElementAdi, String yazi){

        //gelen isimden elementi bulmama lazım

        WebElement myElement=null;

        if (strElementAdi=="username")
            myElement= username;

        if (strElementAdi=="password")
            myElement= password;


        sendKeysFunction(myElement, yazi);
    }



    public void findAndClick(WebElement element){


          clickFunction(element);
    }





}
