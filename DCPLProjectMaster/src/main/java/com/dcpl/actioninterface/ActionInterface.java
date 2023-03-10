package com.dcpl.actioninterface;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterface {
	
	//Add all user actions abstract methods to achieve Abstraction
	
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);
	public void scrollDown(WebDriver driver,WebElement ele);
	public void scrollUP(WebDriver driver,WebElement ele);
	public void click(WebDriver driver,WebElement ele);
	public boolean isDisplayed(WebDriver driver,WebElement ele);
	public boolean type(WebElement ele,String text);
	public boolean findElement(WebDriver driver,WebElement ele);
	public boolean isSelected(WebDriver driver,WebElement ele);
	public boolean isEnabled(WebDriver driver,WebElement ele);
	public boolean selectBySendKeys(String value,WebElement ele);
	public boolean selectByIndex(WebElement element,int index);
	public boolean selectByValue(WebElement element,String value);
	public boolean selectByVisibleText(String visibletext,WebElement ele);
	public boolean mouseHoverByJavaScript(WebElement locator);
	public boolean JSClick(WebDriver driver,WebElement ele);
	public boolean switchToFrameByIndex(WebDriver driver,Duration index);
	public boolean switchToFrameById(WebDriver driver,String idValue);
	public boolean switchToFrameByName(WebDriver driver,String nameValue);
	public boolean switchToDefaultFrame(WebDriver driver);
	public void mouseOverElement(WebDriver driver,WebElement element);
	public boolean moveToElement(WebDriver driver,WebElement ele);
	public boolean mouseover(WebDriver driver,WebElement ele);
	public boolean draggable(WebDriver driver,WebElement source,int x,int y);
	public boolean draganddrop(WebDriver driver,WebElement source,WebElement target);
	public boolean slider(WebDriver driver,WebElement ele,int x,int y);
	public boolean rightclick(WebDriver driver,WebElement ele);
	public boolean switchWindowByTitle(WebDriver driver,String windowTitle,int count);
	public boolean switchToNewWindow(WebDriver driver);
	public boolean switchToOldWindow(WebDriver driver);
	public int getColumnCount(WebElement row);
	public int getRowCount(WebElement table);
	public boolean Alert(WebDriver driver);
	public boolean launchURL(WebDriver driver,String url);
	public boolean isAlertPresent(WebDriver driver);
	public String getCurrentURL(WebDriver driver);
	public String getTitle(WebDriver driver);
	public boolean click1(WebElement locator,String locatorName);
	public void fluentWait(WebDriver driver,WebElement element,int timeOut);
	public void implicitWait(WebDriver driver,int timeOut);
	public void explicitWait(WebDriver driver, WebElement element,Duration timeOut);
	public void pageLoadTimeOut(WebDriver driver,int timeOut);
	public String screenShot(WebDriver driver,String filename);
	public String getCurrentTime();
	//public String getText(WebDriver driver);
	//public void datePicker(WebDriver driver,WebElement ele);
	//public boolean selectDate(WebDriver driver,WebElement ele);
	
	

}
