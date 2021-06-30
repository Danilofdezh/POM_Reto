package com.demoqa.automation.pageobjects;

import net.bytebuddy.implementation.bind.annotation.Default;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.batik.transcoder.keys.StringKey;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class TextBoxPage extends PageObject {

    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By userEmailInput = By.id("userEmail");
    public By genderRadioButton = By.xpath("//label[@for='gender-radio-1']");
    public By mobileNumberInput = By.id("userNumber");
    public By dateofBirthInput = By.id("dateOfBirthInput");
    public By monthSelectListInput = By.xpath("//select[@class='react-datepicker__month-select']");
    public By monthOptionInput  = By.xpath("//*[@value='0' and text()='January']");
    public By yearSelectListInput  = By.xpath("//*[@class='react-datepicker__year-select']");
    public By yearOptionInput  = By.xpath("//*[@value='1993' and text()='1993']");
    public By dayOptionInput  = By.xpath("//*[@class='react-datepicker__day react-datepicker__day--008' and text()='8']");
    public By subjectsInput = By.id("subjectsInput");
    public By hobbiesCheckBox = By.xpath("//label[@for='hobbies-checkbox-1']");
    public By selectPictureButton = By.id("uploadPicture");
    public By currentAddressInput = By.id("currentAddress");
    public By stateInput = By.id("react-select-3-input");
    public By cityInput = By.id("react-select-4-input");
    public By submitButton = By.id("submit");


    public void sendFirstName (String string){getDriver().findElement(firstNameInput).sendKeys(string); }
    public void sendLastName (String string){ getDriver().findElement(lastNameInput).sendKeys(string); }
    public void sendEmail (String string){ getDriver().findElement(userEmailInput).sendKeys(string); }
    public void sendGender(){ getDriver().findElement(genderRadioButton).click(); }
    public void sendMobileNumber(String string){ getDriver().findElement(mobileNumberInput).sendKeys(string); }
    public void sendBirthday(){ getDriver().findElement(dateofBirthInput).click();}
    public void sendSelectMonth(){ getDriver().findElement(monthSelectListInput).click(); }
    public void sendMonthOption(){ getDriver().findElement(monthOptionInput).click(); }
    public void sendSelectYear(){ getDriver().findElement(yearSelectListInput).click(); }
    public void sendYearOption(){ getDriver().findElement(yearOptionInput).click(); }
    public void sendDayOption(){ getDriver().findElement(dayOptionInput).click(); }
    public void sendSubjects(String string){ getDriver().findElement(subjectsInput).sendKeys(string); }
    public void enterSubjects() { getDriver().findElement(subjectsInput).sendKeys(Keys.ENTER); }
    public void sendHobbies (){ getDriver().findElement(hobbiesCheckBox).click(); }
    public void sendSelectPicture(String string){ getDriver().findElement(selectPictureButton).sendKeys(string); }
    public void sendCurrentAddress(String string){ getDriver().findElement(currentAddressInput).sendKeys(string); }
    public void sendState(String string){ getDriver().findElement(stateInput).sendKeys(string); }
    public void enterState(){ getDriver().findElement(stateInput).sendKeys(Keys.ENTER); }
    public void sendCity(String string){ getDriver().findElement(cityInput).sendKeys(string); }
    public void enterCity(){ getDriver().findElement(cityInput).sendKeys(Keys.ENTER); }



    }


