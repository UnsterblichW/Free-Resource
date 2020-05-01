package Login;

import static org.junit.Assert.assertEquals; 
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class LoginTest {
	private String expected;
	private String account;
	private String password;
	
	public LoginTest(String expected,String account,String password) {
		this.expected = expected;
		this.account = account;
		this.password = password;
	}
	
	/*对登录模块测试的内容
	 * 1.使用正确的账号的密码 {"aaa","bbb"} 
	 * 2.使用正确的账号，错误的密码 {"aaa","ccc"}
	 * 3.使用错误的账号，正确的密码 {"aba","bbb"}
	 * 4.使用重名的账号和密码 {"ccc","ddd"}
	 * */
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{"登录成功!", "aaa","bbb"},
			{"用户或密码错误，请重新输入!", "aaa","ccc"},
			{"用户或密码错误，请重新输入!", "aba","bbb"},
			{"有重名用户", "ccc","ddd"}
		});
	}

	@Test
	public void testLogin() {
		assertEquals(expected,Login.login(account, password));
	}

}
