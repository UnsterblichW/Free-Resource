package Login;

import java.util.*;
import dataStored.LoginDataStored;

public class Login {
	static LoginDataStored l=new LoginDataStored();
	public static String login(String AC,String PW) {
		String account = AC;
		String password = PW;

		//���ϵ��û�����
		int count = 0;
	
		//��ʼ���˻���Ϣ
		l.init();
		
		for(int i=0;i<l.list.size();i++) {
			if(account.equals(l.list.get(i).getAccount()) && password.equals(l.list.get(i).getPassword())) {
				count++;
			}
		}
		if(count == 1) {
			return "��¼�ɹ�!";
		}
		else if(count == 0) {
			return "�û��������������������!";
		}
		else {
			return "�������û�";
		}
	}
}