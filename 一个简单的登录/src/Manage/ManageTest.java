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
	* 构造函数
	* @param expected	期望的测试结果，对应参数集中的第一个参数
	* @param target	测试数据，对应参数集中的第二个参数
	*/
	public ManageTest(int expected,String account,String password) {
		this.expected = expected;
		this.account = account;
		this.password = password;
	}
	
	/*对管理模块测试 内容
	 * 1.符合用户只有一个 {"aaa","bbb"} 和 {"bbb","ccc"}
	 * 2.符合用户有两个 {"ccc","ddd"}
	 * 3.没有符合的用户 {"ddd","ddd"}
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
