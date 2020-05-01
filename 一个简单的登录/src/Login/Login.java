package Login;

import java.util.*;
import dataStored.LoginDataStored;

public class Login {
	static LoginDataStored l=new LoginDataStored();
	public static String login(String AC,String PW) {
		String account = AC;
		String password = PW;

		//符合的用户数量
		int count = 0;
	
		//初始化账户信息
		l.init();
		
		for(int i=0;i<l.list.size();i++) {
			if(account.equals(l.list.get(i).getAccount()) && password.equals(l.list.get(i).getPassword())) {
				count++;
			}
		}
		if(count == 1) {
			return "登录成功!";
		}
		else if(count == 0) {
			return "用户或密码错误，请重新输入!";
		}
		else {
			return "有重名用户";
		}
	}
}