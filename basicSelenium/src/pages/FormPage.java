package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	@FindBy(css = "input[name='firstname']")
	private WebElement firstName;
	@FindBy(css = "input[name='lastname']")
	private WebElement lastname;
	@FindBy(css = "input[name='sex']")
	private List<WebElement> genderRadioButtons;
	@FindBy(css = "input[name='exp']")
	private List<WebElement> experienceRadioButtons;
	@FindBy(css = "input[id='datepicker']")
	private WebElement datePicker;
	@FindBy(css = "input[id='profession-1']")
	private WebElement professionCheckBox;
	@FindBy(css = "input[id='tool-2']")
	private WebElement automationToolCheckBox;
	@FindBy(css = "select[id='continents']")
	private WebElement continentsDropDown;
	@FindBy(css = "select[id='selenium_commands']")
	private WebElement seleniumCommandsDropDown;

	public void enterFirstName(String text) {
		firstName.clear();
		firstName.sendKeys(text);
	}

	public void enterLastName(String text) {
		lastname.clear();
		lastname.sendKeys(text);
	}

	public void genderRadioButtonClick() {
		genderRadioButtons.get(1).click();
	}

	public void clickExperience() {
		experienceRadioButtons.get(2).click();
	}

	public void enterDate(String value) {
		datePicker.clear();
		datePicker.sendKeys(value);
	}

	public void clickProfession() {
		professionCheckBox.click();
	}

	public void clickAutomation() {
		automationToolCheckBox.click();
	}

	public void selectContinentsDropDown(String input_value) {
		Select continentCommandsList = new Select(continentsDropDown);
		continentCommandsList.selectByVisibleText(input_value);
	}

	public void selectSeleniumCommand(String value) {
		Select seleniumCommandsList = new Select(seleniumCommandsDropDown);
		seleniumCommandsList.selectByVisibleText(value);
	}

}
