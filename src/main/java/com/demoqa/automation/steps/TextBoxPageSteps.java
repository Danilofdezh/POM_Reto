package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.TextBoxPage;
import com.demoqa.automation.utils.Javascript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class TextBoxPageSteps {
    TextBoxPage textBoxPage = new TextBoxPage();
    DataInjection dataInjection = new DataInjection();


    @Step
    public void openBrowser(){
        textBoxPage.open();
    }

    @Step
    public void fillFieldsInTextBoxPage() throws InterruptedException {
        textBoxPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(2000);
        textBoxPage.sendFirstName(dataInjection.getFirstName());
        textBoxPage.sendLastName(dataInjection.getLastName());
        textBoxPage.sendEmail(dataInjection.getEmail());
        textBoxPage.sendGender();
        textBoxPage.sendMobileNumber(dataInjection.getMobileNumber());
        textBoxPage.sendBirthday();
        textBoxPage.sendSelectMonth();
        textBoxPage.sendMonthOption();
        textBoxPage.sendSelectYear();
        textBoxPage.sendYearOption();
        textBoxPage.sendDayOption();
        textBoxPage.sendSubjects(dataInjection.getSubjects());
        textBoxPage.enterSubjects();
        Javascript.scroll(textBoxPage.getDriver());
        Times.waitFor(1000);
        textBoxPage.sendHobbies();
        textBoxPage.sendSelectPicture(dataInjection.getSelectPicture());
        textBoxPage.sendCurrentAddress(dataInjection.getCurrentAddress());
        textBoxPage.sendState(dataInjection.getState());
        textBoxPage.enterState();
        textBoxPage.sendCity(dataInjection.getCity());
        textBoxPage.enterCity();
        Times.waitFor(1000);
        Javascript.clickJS(textBoxPage.getDriver(), textBoxPage.submitButton);



    }

}
