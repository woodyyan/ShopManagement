package busi;

import java.util.Date;

public class Inventory {
	String goods_no;// 商品编号
	String goods_name;// 商品名称
	int goods_count;// 商品数量
	String goods_unit;// 商品单位
	double goods_price;// 进货价格
	Date purchase_date;// 进货日期

	// public boolean isEnough(Purchase p, int saleNo) {
	// if (p.getGoods_count() >= saleNo) {
	// return true;
	// } else {
	// return false;
	// }
	// }

	public Inventory() {
		super();

	}

	public Inventory(String goods_no, String goods_name, int goods_count, String goods_unit, double goods_price,
			Date purchase_date) {
		super();
		this.goods_no = goods_no;
		this.goods_name = goods_name;
		this.goods_count = goods_count;
		this.goods_unit = goods_unit;
		this.goods_price = goods_price;
		this.purchase_date = purchase_date;
	}

	public String getGoods_no() {
		return goods_no;
	}

	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public int getGoods_count() {
		return goods_count;
	}

	public void setGoods_count(int goods_count) {
		this.goods_count = goods_count;
	}

	public String getGoods_unit() {
		return goods_unit;
	}

	public void setGoods_unit(String goods_unit) {
		this.goods_unit = goods_unit;
	}

	public double getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	@Override
	public String toString() {
		return "Inventory [goods_no=" + goods_no + ", goods_name=" + goods_name + ", goods_count=" + goods_count
				+ ", goods_unit=" + goods_unit + ", goods_price=" + goods_price + ", purchase_date=" + purchase_date
				+ "]";
	}

}
