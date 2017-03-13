package busi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sale {
	String goods_no;// ��Ʒ���
	String goods_name;// ��Ʒ����
	int sale_amt;// ��������
	double price;// ���ۼ۸�
	Date sale_date;// ��������

	public Sale() {
		super();
	}

	public int addSale() {
		return 0;
	}

	public int editSales() {
		return 0;
	}

	public int delSale() {
		return 0;
	}

	public int querySale() {
		return 0;
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

	public int getSale_amt() {
		return sale_amt;
	}

	public void setSale_amt(int sale_amt) {
		this.sale_amt = sale_amt;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getSale_date() {
		return sale_date;
	}

	public void setSale_date(Date sale_date) {
		this.sale_date = sale_date;
	}

	@Override
	public String toString() {
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		String saleDate = date.format(sale_date);
		return "Sale [goods_no=" + goods_no + ", goods_name=" + goods_name + ", sale_amt=" + sale_amt + ", price="
				+ price + ", sale_date=" + saleDate + "]";
	}

}
