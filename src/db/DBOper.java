package db;

import java.util.ArrayList;
import java.util.List;

import busi.Goods;

public class DBOper {
	List<Goods> goods_list;// 存放商品的列表
	// List是一个接口，Goods是泛型

	public DBOper() {
		goods_list = new ArrayList<Goods>();
	}

	public int insertGoods(Goods g) {
		goods_list.add(g);
		return 0;
	}

	public int delGoods(Goods g) {
		for (int i = 0; i < goods_list.size(); i++) {
			String good_no = goods_list.get(i).getGoods_no();// 当前对象商品编号
			String del_goods_no = g.getGoods_no();// 要删除的商品编号
			if (good_no.equals(del_goods_no)) {
				goods_list.remove(i);
			}
		}
		return 0;
	}
}
