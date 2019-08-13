package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pom.HomePage;

public class StepDeffinations {

    HomePage homePage;

    @Given("User landed on loginPag")
    public void user_landed_on_loginPag() {
        HomePage.init();
    }

    @When("User gives Ivnvalid UserName")
    public void user_gives_Ivnvalid_UserName() {
        homePage = new HomePage();
        homePage.setUsename("12345678");
    }

    @Then("User Gives Invalid Password")
    public void user_Gives_Invalid_Password() {
        homePage = new HomePage();
        homePage.setPassword("test@email.com");
    }

    @Then("User Click on login Button")
    public void user_Click_on_login_Button() {
        homePage = new HomePage();
        homePage.setLoginTab();
    }

    @Then("User get error text")
    public void user_get_error_text() {
        HomePage.cleanUp();
    }


//    @Before
//    public void init() {
//        homePage = new HomePage();
//        HomePage.init();
//    }
//
//    @After
//    public void cleanUp() {
//        HomePage.cleanUp();
//    }
//
//
//    @Given("User landed on loginPag")
//    public void user_landed_on_loginPag() {
//        String str = driver.getTitle();
//        Assert.assertEquals(str, str);
//    }
//
//    @When("User gives Ivnvalid UserName")
//    public void user_gives_Ivnvalid_UserName() {
//        this.homePage.setUsename();
//    }
//
//    @Then("User Gives Invalid Password")
//    public void user_Gives_Invalid_Password() {
//        this.homePage.setPassword();
//
//    }
//
//    @Then("User Click on login Button")
//    public void user_Click_on_login_Button() {
//        this.homePage.setLoginTab();
//    }
//
//    @Then("User get error text")
//    public void user_get_error_text() {
//        String str = driver.getTitle();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        System.out.println(str);
//        Assert.assertEquals(str, "Log into Facebook | Facebook");
//    }
//
//    @Then("User Print the Name")
//    public void user_Print_the_Name() {
//        System.out.println(" This file is from scenario");
//    }
//
//    @Then("User Write the name")
//    public void user_Write_the_name() {
//        System.out.println("This is from write the course");
//    }
//
//    @Then("User Come to pnt")
//    public void user_Come_to_pnt() {
//        System.out.println("User come to pnt!!!!!!!");
//    }


    @Given("^User Gives \"(.*)\" And \"(.*)\"$")
    public void user_is_already_in_logIn_Page(String email,String pass) {
        homePage = new HomePage();
        homePage.setUsename(email);
        homePage.setPassword(pass);

    }

    @When("^user click on the login button$")
    public void user_click_on_the_login_button() {
        homePage = new HomePage();
        homePage.setLoginTab();
    }

    @Then("^user should be on the facebook homepgae$")
    public void user_should_be_on_the_facebook_homepgae() {
        homePage = new HomePage();
        String title = homePage.getTitle();
        Assert.assertEquals(title, "facebooktile");
    }

}