package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
WebDriver ldriver;	
public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}

@FindBy(xpath = "//*[@type='email']")
WebElement email;

@FindBy(xpath="//*[@type='password']")
WebElement password;

@FindBy(xpath="//button")
WebElement login;


public void pEmail(String mailid)
{
	email.sendKeys(mailid);
}

public void passWord(String pwd)
{
	password.sendKeys(pwd);
}

public void submit()
{
	login.click();;
}
	
}
