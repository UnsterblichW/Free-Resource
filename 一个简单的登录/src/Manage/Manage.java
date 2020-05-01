package Manage;
import java.util.*;
import dataStored.LoginDataStored;

public class Manage {
	static LoginDataStored l = new LoginDataStored();
	public static int manage(String AC,String PW) {
		String account = AC;
		String password = PW;
		//记录符合的用户数量
		int count = 0;
		//初始化账户信息
		l.init();
		
//		System.out.println("现有的账户信息");
//    	for(int i=0;i<l.list.size();i++)
//		{
//    		System.out.println(l.list.get(i).getAccount() + l.list.get(i).getPassword());
//		}
		for(int i=0;i<l.list.size();i++)
		{
			if(account.equals(l.list.get(i).getAccount()) && password.equals(l.list.get(i).getPassword())) {
				count++;				
			}	
		}

		return count;
		
	}

}
