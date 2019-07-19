package tceBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TCEPageObjects {

	public static void main(String[] args) {
		WebElement userid = driver.findElement(By.id("com.app.tce:id/edt_sign_in_user_name"));
		WebElement password = driver.findElement(By.id("com.app.tce:id/edt_sign_in_password"));
		WebElement signBtn = driver.findElement(By.id("com.app.tce:id/btn_sign_in"));

	}

}
