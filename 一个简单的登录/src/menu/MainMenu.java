package menu;

import java.util.Scanner;

import Login.Login;
import dataStored.LoginDataStored;
import Manage.Manage;

public class MainMenu {
	static Scanner in = new Scanner(System.in);
	static Login l = new Login();// ��¼����
	static LoginDataStored lo = new LoginDataStored();
	static Manage m = new Manage();
	static String account = null;
	static String password = null;
	static String s;

	public static void main(String[] args) {
		int t = -1;
		do {
			info("��ӭ���� xxx ϵͳ");
			info("1��ע��");
			info("2����¼");
			info("3������");
			info("4���˳�");
			info("���������ѡ��������һ��������:");
			t = in.nextInt();
			switch (t) {
			case 1:
				// ����ע�����
				lo.Register();
				continue;
			case 2:
				// �����¼����
				System.out.println("***************�����ǵ�¼����***************");
				System.out.println("����������˺�:");
				account = in.next();
				System.out.println("�������������:");
				password = in.next();
				System.out.println(l.login(account, password));
				System.out.println("���������ַ�������.......");
				//�����ַ�������ͣһ��
				s = in.next();
				continue;
			case 3:
				// ����������
				System.out.println("*************�������˻��������**************");
				System.out.println("**����Ҫ���ҵ��˻������룬���ط��ϵ��û�����**");
				System.out.println("�������˺�:");
				account = in.next();
				System.out.println("����������:");
				password = in.next();
				if(m.manage(account, password) != 0) {
					System.out.println("���ϵ��û�����Ϊ��" + m.manage(account, password));
				}
				else {
					System.out.println("�˻����������û�з��ϵ��û�");
				}
				System.out.println("���������ַ�������.......");
				//�����ַ�������ͣһ��
				s = in.next();
				continue;
			case 4:
				// �˳�
				return;
			default:
				info("���������������������...");
				// t=in.nextInt();
				continue;
			}
		} while (t != 1 || t != 2 || t != 4);
	}

	public static void info(String str) {
		System.out.println(str);
	}
}