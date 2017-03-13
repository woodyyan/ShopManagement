package busi;

public class TransFactory {

	public TransInterface createTrans(String strTrans) {
		TransInterface trans = null;

		if (strTrans.equals("1")) {// �����Ʒ��Ϣ����
			trans = new TransAddGoods();
		} else if (strTrans.equals("2")) {// �޸���Ʒ��Ϣ
			trans = new TransEditGoods();
		} else if (strTrans.equals("3")) {// ��ѯ��Ʒ
			trans = new TransQueryGoods();
		} else if (strTrans.equals("4")) {// ����������
			trans = new TransAddPrvd();
		} else if (strTrans.equals("5")) {// �޸Ĺ�����
			trans = new TransEditProvider();
		} else if (strTrans.equals("6")) {// ��ѯ������
			trans = new TransQueryProvider();
		} else if (strTrans.equals("7")) {
			trans = new TransAddPurchase();// �ɹ���Ϣ¼��
		} else if (strTrans.equals("8")) {
			trans = new TransAddSale();// ������Ϣ¼��
		} else if (strTrans.equals("9")) {
			trans = new TransEditInventory();// �޸Ŀ����Ϣ
		} else if (strTrans.equals("0")) {
			trans = new TransQueryInventory();// ��ѯ�����Ϣ
		}
		return trans;
	}
}
