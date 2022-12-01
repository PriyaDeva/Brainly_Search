package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends BasePage {

	public SearchBar(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="(//a[@class='sg-button sg-button--s sg-button--transparent linkButton--3f_y6'])[2]")
	//@FindBy (xpath="//span[text()='Log in']")
	WebElement Login;
	public void enterLoginButton() {
		clickAction(Login);
	 }
    
	
   

	@FindBy (xpath = "//input[@type='search']")
	WebElement SearchTF;
	public void enterTextInSearch( String search) {
		enter_value(SearchTF, search);
		}

	
    
	@FindBy(xpath ="//button[@aria-label='search button']")
    WebElement Search;
	 public void enterSearchButton1() {
		 clickAction(Search);
	  }
	 
	 
	 @FindBy(xpath = "(//div[@data-testid='search-item-facade-wrapper'])[1]")
	 WebElement Answer1;
		public void clickAnswer1() {
			clickAction(Answer1);	
		}
		
		
		
	  @FindBy(xpath = "//button[@data-testid='see_answers_button']")
		 WebElement SeeAnswer;
			public void enterSeeAnswer() {
				clickAction(SeeAnswer);	
			}
			
			//button[@class='sg-button sg-button--m sg-button--solid sg-button--full-width SeeAnswersButton-module__button--RrJwH']
      @FindBy(xpath = "sg-button sg-button--m sg-button--solid sg-button--full-width SeeAnswersButton-module__button--RrJwH")
		 WebElement SeeAnswer2;
		    public void enterSeeAnswer2() {
				clickAction(SeeAnswer2);	
				}
		
		    @FindBy(xpath="//div/a[@class='sg-textarea sg-textarea--full-width']")
		    WebElement SearchTF2;
		    public void Click_SearchTF2() {
		    	clickAction(SearchTF2);
		    }
		    
		    
	  @FindBy(xpath = "//div/textarea[@class='brn-question-editor__instance sg-textarea sg-textarea--full-width sg-textarea--xtall js-ask-textarea']")
		    WebElement SearchTF1;
			  public void enterTextInSearchbox1(String search) {
				enter_value(SearchTF1, search);
				}
	
		 

		//@FindBy(xpath = "//select[@class='sg-select__element']")
			//WebElement PickSubject;
			  // public void PickSubject1() {
				//clickAction(PickSubject);	
					//}
			   
	  @FindBy(xpath = "(//div/button/span[@class=\"sg-button__text\"])[4]")
		  WebElement AskQuestionButton;
			  public void ClickAnswerButton() {
				clickAction(AskQuestionButton);
			  }

}
