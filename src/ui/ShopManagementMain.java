package ui;

import java.util.Scanner;

import busi.Goods;
import busi.Provider;
import busi.TransFactory;
import busi.TransInterface;
import db.DBOper;

public class ShopManagementMain {

	public static void main(String[] args) {
		// 1.���ȴ�ӡ�˵�������
		// 2.�ͻ�ѡ���׺󣬽���������׶�Ӧ�Ĳ���/��ʾ����
		// 3.�ͻ��������󣬴ӽ����ȡ�ͻ����������
		// 4.ִ�иý��ף����Ҵ�ӡִ�н��
		Scanner scan = new Scanner(System.in);

		DBOper dbhelper = new DBOper();// ���ݲ�������
		/* ��Ӳ������� */
		Goods g1 = new Goods("0001", "��ΪP8", "��", "0");
		Goods g2 = new Goods("0002", "��Ϊ��â", "��", "0");
		Goods g3 = new Goods("0003", "Iphone7", "��", "0");
		Goods g4 = new Goods("0004", "����Galaxy", "��", "0");
		dbhelper.insertGoods(g1);
		dbhelper.insertGoods(g2);
		dbhelper.insertGoods(g3);
		dbhelper.insertGoods(g4);

		Provider p1 = new Provider("01", "Ѹ��ͨѶ", "�츮����", "02812345675", "0");
		Provider p2 = new Provider("02", "����ͨ", "�츮����", "02812345676", "0");
		Provider p3 = new Provider("03", "����", "̫����·", "02812345677", "0");
		Provider p4 = new Provider("04", "������", "�츮���", "02812345678", "0");
		dbhelper.insertProvider(p1);
		dbhelper.insertProvider(p2);
		dbhelper.insertProvider(p3);
		dbhelper.insertProvider(p4);

		/* ��Ӳ������ݽ��� */

		while (true) {
			prtMainMenu(); // ��ӡ���˵�

			String strTrans = scan.next();// ��ȡ����
			if (strTrans.equalsIgnoreCase("q")) {
				break;
			}

			TransInterface trans = null;
			TransFactory tFactory = new TransFactory();
			trans = tFactory.createTrans(strTrans);
			if (trans != null) {
				trans.setDbhelper(dbhelper);
				trans.prtPrompt();// ��ӡ������ʾ��Ϣ
				if (trans.getInput() != 0) {// ��ȡ���������
					trans.prtResult();
					System.out.println("��ȡ��������ʧ��");
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
				System.out.println("��������ʵ������");
			}
		}

		scan.close();
		System.out.println("ϵͳ�����˳�");
	}

	public static void prtMainMenu() {
		System.out.println();
		System.out.println("****************��Ʒ������ϵͳ*****************");
		System.out.println("\t1-�����Ʒ��Ϣ\t2-�޸���Ʒ��Ϣ");
		System.out.println("\t3-��ѯ��Ʒ��Ϣ\t4-����������");
		System.out.println("\t5-�޸Ĺ�������Ϣ\t6-��ѯ��������Ϣ");
		System.out.println("\t7-�ɹ���Ϣ¼��\t8-������Ϣ¼��");
		System.out.println("\t9-����ѯ\t0-����޸�");
		System.out.println("********************************************");
		System.out.println("��������Ҫ���еĲ���,�˳�������q/Q��");
		System.out.println();
	}
}
