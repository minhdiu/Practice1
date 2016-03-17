package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ISMSPage
{ 
    @FindBy(xpath = "//*[contains(text(),'ISMS Helpdesk')]")
  //input[contains(@name,'pass')]

    public WebElement ISMSHelpdesk_btn;
    
    @FindBy(xpath = "//*[contains(text(),'ISMS Request')]")
    public WebElement ISMSRequest;


    @FindBy(xpath = "//*[contains(text(),'ISMS Issue')]")
    public WebElement ISMSIssue; 


    @FindBy(xpath = "//*[contains(text(),'Compose ISMS Request')]")
    public WebElement ComposeISMSRequest;
    
    @FindBy(xpath = "//*[contains(text(),'Issue Management')]")
    public WebElement IssueManagement;
    
    @FindBy(xpath = "//*[contains(text(),'Assets')]")
    public WebElement Assets;
    
    @FindBy(xpath = "//*[contains(text(),'Asset Categories')]")
    public WebElement AssetCategories;

    
    

}
