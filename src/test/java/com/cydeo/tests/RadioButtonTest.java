package com.cydeo.tests;

import com.cydeo.pages.RadioButtonPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Test
    public void radioButtonTest(){
        //TC #1:radio buttons
        //1.GO TO: http://practice.cydeo.com/radio_buttons
        Driver.getDriver().get("http://practice.cydeo.com/radio_buttons");

        //2. Confirm radio button #Blue is selected by default
        Assert.assertTrue(radioButtonPage.blueButton.isSelected());

        //3. Confirm radio button #Football is NOT selected by default
        Assert.assertTrue(!radioButtonPage.footballButton.isSelected());

        //4. Click radio button #Football to select it.
        radioButtonPage.footballButton.click();

        //5. Verify radio button #Football is selected.
        Assert.assertTrue(radioButtonPage.footballButton.isSelected());

        //6. Click radio button #Red to select it.
        radioButtonPage.redButton.click();

        //7. Verify radio button #Red is selected.
        Assert.assertTrue(radioButtonPage.redButton.isSelected());

        //8. Verify radio button #Blue is not selected.
        Assert.assertTrue(!radioButtonPage.blueButton.isSelected());

        //9. Verify radio button #Green is not Enabled.
        //Assert.assertTrue(radioButtonPage.greenButton.isEnabled(),"Green button is disabled!");
        Assert.assertTrue(!radioButtonPage.greenButton.isEnabled(),"Green button is enable!");

    }

}
