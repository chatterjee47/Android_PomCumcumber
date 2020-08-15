package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import BaseClass.MobileConfiguration;
import PageObjectRepository.GeneralStoreDetailsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import Utility.Utilities;

public class GeneralStoreTest extends MobileConfiguration {

	public static AndroidDriver<AndroidElement> driver;
	GeneralStoreDetailsPage GSDP;
	Utilities Utilities;
	
	@Given("^User opens General Store$")
	public void user_opens_General_Store() throws Throwable {
		startAppiumServer();
		launchEmulator("EmulatorOne");
		driver = MobileConfiguration.MobileSetUp("EmulatorOne", "7.1.1", "Android", "com.androidsample.generalstore",
				"com.androidsample.generalstore.SplashActivity");
		System.out.println("GeneralStore app is opened successfully");
	}

	@Then("^User Selects India from Country dropdown$")
	public void user_Selects_India_from_Country_dropdown() throws Throwable {
		
		GSDP =new GeneralStoreDetailsPage(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		GSDP.clickCountryDropdown();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		Utilities CountryDropdown = new Utilities(driver);
		CountryDropdown.scrollToText("India");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		GSDP.SelectCountry();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Then("^User enters name \"([^\"]*)\"$")
	public void user_enters_name(String EnterName) throws Throwable {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		GSDP =new GeneralStoreDetailsPage(driver);
		GSDP.setname(EnterName);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Then("^User click on Lets shop button$")
	public void user_click_on_Lets_shop_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		GSDP =new GeneralStoreDetailsPage(driver);
		GSDP.ClickLetsShopBtn();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		int count= GSDP.ProductDetails.size();
	
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Calculator Test Case Executed Successfully!");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
}
