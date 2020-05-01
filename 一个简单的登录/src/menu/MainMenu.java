package menu;

import java.util.Scanner;

import Login.Login;
import dataStored.LoginDataStored;
import Manage.Manage;

public class MainMenu {
	static Scanner in = new Scanner(System.in);
	static Login l = new Login();// 登录界面
	static LoginDataStored lo = new LoginDataStored();
	static Manage m = new Manage();
	static String account = null;
	static String password = null;
	static String s;

	public static void main(String[] args) {
		int t = -1;
		do {
			info("欢迎来到 xxx 系统");
			info("1、注册");
			info("2、登录");
			info("3、管理");
			info("4、退出");
			info("请输入你的选择（请输入一个整数）:");
			t = in.nextInt();
			switch (t) {
			case 1:
				// 进入注册界面
				lo.Register();
				continue;
			case 2:
				// 进入登录界面
				System.out.println("***************这里是登录界面***************");
				System.out.println("请输入你的账号:");
				account = in.next();
				System.out.println("请输入你的密码:");
				password = in.next();
				System.out.println(l.login(account, password));
				System.out.println("输入任意字符串继续.......");
				//接受字符串来暂停一下
				s = in.next();
				continue;
			case 3:
				// 进入管理界面
				System.out.println("*************这里是账户管理界面**************");
				System.out.println("**输入要查找的账户和密码，返回符合的用户数量**");
				System.out.println("请输入账号:");
				account = in.next();
				System.out.println("请输入密码:");
				password = in.next();
				if(m.manage(account, password) != 0) {
					System.out.println("符合的用户数量为：" + m.manage(account, password));
				}
				else {
					System.out.println("账户或密码错误，没有符合的用户");
				}
				System.out.println("输入任意字符串继续.......");
				//接受字符串来暂停一下
				s = in.next();
				continue;
			case 4:
				// 退出
				return;
			default:
				info("你的输入有误，请重新输入...");
				// t=in.nextInt();
				continue;
			}
		} while (t != 1 || t != 2 || t != 4);
	}

	public static void info(String str) {
		System.out.println(str);
	}
}