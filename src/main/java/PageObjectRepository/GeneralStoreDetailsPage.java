package PageObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GeneralStoreDetailsPage {
	WebDriver driver;
	public static AndroidDriver<AndroidElement> Mobiledriver;
	public GeneralStoreDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']")
	private WebElement CountryDropdown;

	public void clickCountryDropdown() {
		CountryDropdown.click();
	}

	@FindBy(xpath = "//android.widget.TextView[@text='India']")
	private WebElement SelectCountry;

	public void SelectCountry() {
		SelectCountry.click();
	}

	@FindBy(xpath = "//android.widget.EditText[@text='Enter name here']")
	private WebElement EnterName;

	public void setname(String strname) {
		EnterName.sendKeys(strname);
	}

	@FindBy(xpath = "//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']")
	private WebElement LetsShopBtn;
	
	public void ClickLetsShopBtn() {
		LetsShopBtn.click();
	}
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']")
	public List<WebElement> ProductDetails;

}
