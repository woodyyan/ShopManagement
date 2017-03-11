package busi;

public class TransFactory {

	public TransInterface createTrans(String strTrans) {
		TransInterface trans = null;

		if (strTrans.equals("1")) {// 添加商品信息交易
			trans = new TransAddGoods();
		} else if (strTrans.equals("2")) {// 查询商品
			trans = new TransEditGoods();
		} else if (strTrans.equals("3")) {// 查询商品
			trans = new TransQueryGoods();
		} else if (strTrans.equals("4")) {// 查询商品
			trans = new TransAddPrvd();
		}
		return trans;
	}
}
