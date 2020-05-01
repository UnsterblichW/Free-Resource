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
	
	/*�Ե�¼ģ����Ե�����
	 * 1.ʹ����ȷ���˺ŵ����� {"aaa","bbb"} 
	 * 2.ʹ����ȷ���˺ţ���������� {"aaa","ccc"}
	 * 3.ʹ�ô�����˺ţ���ȷ������ {"aba","bbb"}
	 * 4.ʹ���������˺ź����� {"ccc","ddd"}
	 * */
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{"��¼�ɹ�!", "aaa","bbb"},
			{"�û��������������������!", "aaa","ccc"},
			{"�û��������������������!", "aba","bbb"},
			{"�������û�", "ccc","ddd"}
		});
	}

	@Test
	public void testLogin() {
		assertEquals(expected,Login.login(account, password));
	}

}
