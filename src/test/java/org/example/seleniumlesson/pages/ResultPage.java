package org.example.seleniumlesson.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage {

    @FindBy(css = "#sb_form_q")
    private WebElement searchField;

    @FindBy(css = "h2  > a[href]")
    public static List <WebElement> results;

    public void sendText(String text) {
        searchField.sendKeys(text);
        searchField.submit();
        System.out.println("Введен текст " + text);
    }

    public String getFieldValue(){
        String value = searchField.getAttribute("value");
        System.out.println("В строке поиска текст " + value);
        return value;
    }

    public void clickElement( int num) {
        results.get(num).click();
        System.out.println("Вы нажали на " + num + " элемент");
    }


    public ResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
