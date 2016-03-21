package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ISMSPage
{ 
    @FindBy(xpath = "//*[contains(text(),'ISMS Helpdesk')]")
    public WebElement ISMSHelpdesk_btn;
    
    @FindBy(xpath = "//*[contains(text(),'Diu-Tran Thi Minh Diu')]")
    public WebElement namename;
    @FindBy(xpath = "//*[contains(text(),'Log out')]")
    public WebElement logout_btn;
    
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
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[1]/td[2]/span")
    public WebElement composeIssue_txb;
    
    @FindBy(id="oe-field-input-38")
    public WebElement composeCategory_txb;
    
    @FindBy(id="oe-field-input-39")
    public WebElement composeProblem_txb;
    
    @FindBy(id="oe-field-input-40")
    public WebElement similarIssue_txb;
    
    @FindBy(xpath="//div[2]/div[2]/div/div/div/div/div[4]/div/div/div[1]/textarea")
    public WebElement descripIssue_txb;
    
    @FindBy(xpath=".//*[@id='ui-id-4']")
    public WebElement composeTitle;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[1]/td[1]")
    public WebElement composeIssue_label;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[2]/td[1]")
    public WebElement composeCategory_lable;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[3]/td[1]")
    public WebElement composeProblem_lable;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[4]/td[1]")
    public WebElement similarIssue_lable;
    
//    @FindBy(xpath="//div[1]/textarea")
//    public WebElement descripIssue_lable;
    
    @FindBy(xpath="//div[2]/div[11]/div/footer/button[1]")
    public WebElement composeSend_btn;

}
