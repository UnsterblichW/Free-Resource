package Manage;
import java.util.*;
import dataStored.LoginDataStored;

public class Manage {
	static LoginDataStored l = new LoginDataStored();
	public static int manage(String AC,String PW) {
		String account = AC;
		String password = PW;
		//��¼���ϵ��û�����
		int count = 0;
		//��ʼ���˻���Ϣ
		l.init();
		
//		System.out.println("���е��˻���Ϣ");
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
