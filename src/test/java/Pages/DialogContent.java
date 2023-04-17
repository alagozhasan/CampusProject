package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement section;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement FormAddBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    public WebElement existMessage;

    @FindBy(xpath = "//div[contains(text(),'There is no data to display')]")
    public WebElement noDisplayMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@data-placeholder='Name']/input")
    private WebElement nameInput;

    @FindBy(xpath = " //ms-text-field/input[@data-placeholder='Name']")
    private WebElement searchName;    //we can delete nameSearch, niye ingilizce yazdım bilmiyorum, BankAccount un altındaki Name i de buluyo bu bulduğum Gökçenin sayfasında

    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    public WebElement nameAttestation;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement nameSearch;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//tr/td[2])")
    private List<WebElement> myDataOnList;

    @FindBy(tagName = "ms-edit-button")
    private WebElement lastItemEditBtn;

    @FindBy(css = "svg[data-icon='pen-to-square']")
    public WebElement editButton;

    @FindBy(css = "[data-icon='trash-can']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement deleteConfirmButton;

    @FindBy(xpath="//span[text()=' Cancel ']")
    public WebElement cancelButton;

    @FindBy(tagName = "ms-delete-button")
    private WebElement lastItemDeleteBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput2;
    @FindBy(css = "dynamic-view[class='ng-star-inserted']")
    private WebElement dynamicMessage;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement descriptionInputSearch;

    @FindBy(xpath = "(//mat-form-field)[2]")
    private WebElement integrationCodeSearch;

    @FindBy(css = "[formcontrolname='description']>input")
    private WebElement descriptionInput;

    @FindBy(css = "[formcontrolname='code']>input")
    private WebElement integrationInput;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;

    @FindBy(xpath = "//ms-text-field/input")
    public WebElement nameInput3;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    public WebElement ibanInput; // Gökçe

    @FindBy(xpath = "(//span[text()='Currency'])[3]")
    public WebElement currency; // Gökçe

    @FindBy(css = "[formcontrolname='integrationCode']>input")
    public WebElement integrationInput2;


    @FindBy(xpath = "(//div[contains(@class,'form-field')]//mat-select[@role='combobox'])[2]/div")
    private WebElement fieldType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[6]")
    private WebElement optionLogical;
    @FindBy(xpath="//td[contains(@class,'mat-cell')][text()='Jhon Wick']")
    private WebElement searchResult;


    @FindBy(xpath="//ms-integer-field[@formcontrolname='capacity']/input")
    private WebElement capacity;

    @FindBy(css="[formcontrolname='order']>input")
    private WebElement order;

    @FindBy(xpath="//span[@class='mat-option-text'] ")
    private WebElement nextGrade;

    @FindBy(xpath = "//tr[@role='row']/td[2]")
    public List<WebElement> nameList;

    @FindBy(css = "[role='columnheader']")
    public WebElement orderSearchName;






    public WebElement getSearchResult() {
        return searchResult;
    }

    public WebElement getWebElement(String element) {
        switch (element) {
            case "addButton": return addButton;
            case "saveButton": return saveButton;
            case "nameInput": return nameInput;
            case "nameAttestation": return nameAttestation;
            case "codeInput": return codeInput;
            case "section": return section;
            case "shortName": return shortName;
            case "FormAddBtn": return FormAddBtn;
            case "lastItemEditBtn": return lastItemEditBtn;
            case "lastItemDeleteBtn": return lastItemDeleteBtn;
            case "deleteDialogBtn": return deleteDialogBtn;
            case "searchButton": return searchButton;
            case "editButton": return editButton;
            case "deleteButton": return deleteButton;
            case "deleteConfirmButton": return deleteConfirmButton;
            case "nameInput2":return nameInput2;
            case "dynamicMessage": return dynamicMessage;
            case "nameSearch" : return nameSearch;
            case "descriptionInputSearch" : return descriptionInputSearch;
            case "priorityCode" : return priorityCode;
            case "toggleBar" : return toggleBar;
            case "integrationInput" : return integrationInput;
            case "descriptionInput" : return descriptionInput;
            case "fieldType" : return fieldType;
            case "optionLogical" : return optionLogical;
            case "searchName" : return searchName;
            case "cancelButton" : return cancelButton;
            case "capacity" : return capacity;
            case "order" : return order;
            case "nextGrade" : return nextGrade;



        }

        return null;
    }
    public List<WebElement> getMyDataOnList() {
        return myDataOnList;
    }



}
