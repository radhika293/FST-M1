import ...
import org.testng.annotations.Parameters;

@Test 
@Parameters({ "sUsername", "sPassword" })
public void test(String sUsername, String sPassword) {
    //Statements that use sUsername and sPassword.
}