package Manage;

import static org.junit.Assert.assertEquals; 
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ManageTest {
	private int expected;
	private String account;
	private String password;
	
	/**
	* ���캯��
	* @param expected	�����Ĳ��Խ������Ӧ�������еĵ�һ������
	* @param target	�������ݣ���Ӧ�������еĵڶ�������
	*/
	public ManageTest(int expected,String account,String password) {
		this.expected = expected;
		this.account = account;
		this.password = password;
	}
	
	/*�Թ���ģ����� ����
	 * 1.�����û�ֻ��һ�� {"aaa","bbb"} �� {"bbb","ccc"}
	 * 2.�����û������� {"ccc","ddd"}
	 * 3.û�з��ϵ��û� {"ddd","ddd"}
	 * */
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{1, "aaa","bbb"},
			{1, "bbb","ccc"},
			{2, "ccc","ddd"},
			{0, "ddd","ddd"}
		});
	}

	@Test
	public void testManage() {
		assertEquals(expected,Manage.manage(account, password));
	}

}
