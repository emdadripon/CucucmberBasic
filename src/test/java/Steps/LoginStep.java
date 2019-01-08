package Steps;

import Base.BaseUtil;
import Transformation.EmailTransformation;
import Transformation.SalaryCountTransformer;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {
    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        base.Driver.navigate().to("https://www.att.com/my/#/login");
        System.out.println("I navigate to the login page");
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("I click login button");
        
    }

    @And("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {

        System.out.println("I should see the userform page");
    }

    @And("^I  enter the the following for login$")
    public void iEnterTheTheFollowingForLogin(DataTable table) {
       /* List<List<String>> data = table.raw();

        System.out.print("The Value is : " + data.get(0).get(0).toString());
        System.out.print("The Value is : " + data.get(0).get(1).toString());*/

        List<User> users = new ArrayList<User>();
        // Store all the users
        users = table.asList(User.class);

        for(User user: users){
            System.out.println("The UserName is " + user.username);
            System.out.println("The PassWord is " + user.password);
        }
    }

    @And("^I  enter the ([^\"]*) and ([^\"]*)$")
    public void iEnterTheUsernameAndPassword(String  userName, String passWord) {

        System.out.println("UserName is: " + userName);
        System.out.println("Password is: " + passWord);
    }

    @And("^I enter the user email address as Email:([^\"]*)$")
    public void iEnterTheUserEmailAddressAsEmailAdmin(@Transform(EmailTransformation.class) String email) {
        System.out.println("The Email address is " + email);
    }

    @And("^I verify the count of my salary digits for dollar (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForDollar(@Transform(SalaryCountTransformer.class) int salary) {
        System.out.println("My Salary digits count is: " + salary);
    }



    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }

}
