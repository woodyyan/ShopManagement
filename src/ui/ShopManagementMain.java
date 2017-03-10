package ui;

import java.util.Scanner;

import busi.TransFactory;
import busi.TransInterface;
import db.DBOper;

public class ShopManagementMain {

	public static void main(String[] args) {
		// 1.首先打印菜单主界面
		// 2.客户选择交易后，进入各个交易对应的操作/提示界面
		// 3.客户完成输入后，从界面读取客户输入的数据
		// 4.执行该交易，并且打印执行结果
		Scanner scan = new Scanner(System.in);

		DBOper dbhelper = new DBOper();// 数据操作对象

		while (true) {
			prtMainMenu(); // 打印主菜单

			String strTrans = scan.next();// 读取交易
			if (strTrans.equalsIgnoreCase("q")) {
				break;
			}

			TransInterface trans = null;
			TransFactory tFactory = new TransFactory();
			trans = tFactory.createTrans(strTrans);
			if (trans != null) {
				trans.setDbhelper(dbhelper);
				trans.prtPrompt();// 打印交易提示信息
				if (trans.getInput() != 0) {// 读取输入的数据
					System.out.println("获取输入数据失败");
				} else {
					if (trans.doTrans() != 0) {
						trans.prtResult();
						continue;
					} else {
						trans.prtResult();
						continue;
					}
				}
			} else {
				System.out.println("创建交易实例出错");
			}
		}

		scan.close();
		System.out.println("系统正常退出");
	}

	public static void prtMainMenu() {
		System.out.println();
		System.out.println("****************商品进销存系统*****************");
		System.out.println("\t1-添加商品信息\t2-修改商品信息");
		System.out.println("\t3-查询商品信息\t4-新增供货商");
		System.out.println("\t5-修改供货商信息\t6-查询供货商信息");
		System.out.println("\t7-采购信息录入\t8-销售信息录入");
		System.out.println("********************************************");
		System.out.println("请输入您要进行的操作,退出请输入q/Q：");
		System.out.println();
	}
}
