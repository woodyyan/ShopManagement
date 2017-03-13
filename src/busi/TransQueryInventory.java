package busi;

import java.util.List;

public class TransQueryInventory extends TransAbs {
	String query_type;
	String goods_no;// ��Ʒ���
	String goods_name;// ��Ʒ����

	public void prtPrompt() {
		System.out.println("��ѯ��Ʒ|������������Ϣ��");
		System.out.println("@query_type @goods_no @goods_name");
		System.out.println("query_type��0-ȫ����ѯ  1-��ȷ��ѯ   2-ģ����ѯ");
	}

	public int getInput() {
		// ��ȡ��ѯ��ʽ
		query_type = scan.next();
		if (query_type == null) {
			setTrans_result("��ȡ��ѯ��ʽʧ��");
			return -1;
		} else if (query_type.equals("0")) {// ȫ����ѯ����Ҫ��ȡʣ��Ĳ���
			return 0;
		}

		// ��Ʒ���
		goods_no = scan.next();
		if (goods_no == null) {
			setTrans_result("��ȡ��Ʒ��Ŵ���");
			return -1;
		}

		// ��Ʒ����
		goods_name = scan.next();
		if (goods_name == null) {
			setTrans_result("��ȡ��Ʒ���ƴ���");
			return -1;
		}
		return 0;
	}

	public int doTrans() {
		if (query_type.equals("0")) {// ȫ����ѯ
			getDbhelper().prtAllInventory();
			setTrans_result("��ѯ���");
			return 0;
		} else if (query_type.equals("1")) {// ��ȷ��ѯ
			Inventory inventory = dbhelper.exactFindInventory(goods_no);
			if (inventory != null) {
				System.out.println(inventory.toString());
				setTrans_result("��ȷ��ѯ���");
				return 0;
			} else {
				setTrans_result("û�в鵽�����Ϣ��");
				return -1;
			}
		} else if (query_type.equals("2")) {// ģ����ѯ

			if (dbhelper.fuzFindInventory(goods_name) != null) {
				List<Inventory> list = dbhelper.fuzFindInventory(goods_name);
				for (Inventory i : list) {
					System.out.println(i.toString());
				}
				setTrans_result("ģ����ѯ���");
				return 0;
			} else {
				setTrans_result("û�в鵽�����Ϣ��");
				return -1;
			}

		}
		return 0;
	}

	public void prtResult() {
		System.out.println(trans_result);
	}
}
