package db;

import java.util.ArrayList;
import java.util.List;

import busi.Goods;
import busi.Inventory;
import busi.Provider;
import busi.Purchase;
import busi.Sale;

public class DBOper {
	// List��һ���ӿڣ�Goods�Ƿ���
	List<Goods> goods_list;// �����Ʒ���б�
	List<Provider> provider_list;// ��Ź����̵��б�
	List<Sale> sale_list;// ��Ųɹ���Ϣ���б�
	List<Purchase> purchase_list;
	List<Inventory> inventory_list;

	public DBOper() {
		goods_list = new ArrayList<Goods>();
		provider_list = new ArrayList<Provider>();
		purchase_list = new ArrayList<Purchase>();
		sale_list = new ArrayList<Sale>();
		inventory_list = new ArrayList<Inventory>();

	}

	public Goods exactFindGoods(String no) {
		for (Goods g : goods_list) {
			if (g.getGoods_no().equals(no)) {
				return g;
			}
		}
		return null;
	}

	public Provider exactFindProvider(String no) {
		for (Provider p : provider_list) {
			if (p.getProvider_no().equals(no)) {
				return p;
			}
		}
		return null;
	}

	public Sale exactFindSale(String no) {
		for (Sale s : sale_list) {
			if (s.getGoods_no().equals(no)) {
				return s;
			}
		}
		return null;
	}

	public Inventory exactFindInventory(String no) {
		for (Inventory i : inventory_list) {
			if (i.getGoods_no().equals(no)) {
				return i;
			}
		}
		return null;
	}

	public List<Goods> fuzFindGoods(String str) {
		List<Goods> list = new ArrayList<Goods>();
		for (Goods g : goods_list) {
			if (g.getGoods_name().indexOf(str) != -1) {
				list.add(g);
			}
		}
		return list;
	}

	public List<Provider> fuzFindProvider(String str) {
		List<Provider> list = new ArrayList<Provider>();
		for (Provider p : provider_list) {
			if (p.getProvider_name().indexOf(str) != -1) {
				list.add(p);
			}
		}
		return list;
	}

	public List<Inventory> fuzFindInventory(String str) {
		List<Inventory> list = new ArrayList<Inventory>();
		for (Inventory i : inventory_list) {
			if (i.getGoods_name().indexOf(str) != -1) {
				list.add(i);
			}
		}
		return list;
	}

	public int insertGoods(Goods g) {
		goods_list.add(g);
		return 0;
	}

	public int insertProvider(Provider p) {
		provider_list.add(p);
		return 0;
	}

	public int insertPurchase(Purchase p) {
		purchase_list.add(p);
		return 0;
	}

	public int insertSale(Sale s) {
		sale_list.add(s);
		return 0;
	}

	public int insertInventory(Inventory i) {
		inventory_list.add(i);
		return 0;
	}

	public List<Inventory> getInventory_list() {
		return inventory_list;
	}

	public void setInventory_list(List<Inventory> inventory_list) {
		this.inventory_list = inventory_list;
	}

	public int delGoods(Goods g) {
		for (int i = 0; i < goods_list.size(); i++) {
			String good_no = goods_list.get(i).getGoods_no();// ��ǰ������Ʒ���
			String del_goods_no = g.getGoods_no();// Ҫɾ������Ʒ���
			if (good_no.equals(del_goods_no)) {
				goods_list.remove(i);
			}
		}
		return 0;
	}

	public int delProvider(Provider p) {
		for (int i = 0; i < provider_list.size(); i++) {
			String provider_no = provider_list.get(i).getProvider_no();// ��ǰ���󹩻��̱��
			String del_provider_no = p.getProvider_no();// Ҫɾ���Ĺ����̱��
			if (provider_no.equals(del_provider_no)) {
				provider_list.remove(i);
			}
		}
		return 0;
	}

	public int prtAllGoods() {
		for (Goods g : goods_list) {
			System.out.println(g.toString());
		}
		return 0;
	}

	public int prtAllProvider() {
		for (Provider p : provider_list) {
			System.out.println(p.toString());
		}
		return 0;
	}

	public int prtAllPurchase() {
		for (Purchase p : purchase_list) {
			System.out.println(p.toString());
		}
		return 0;
	}

	public int prtAllSale() {
		for (Sale s : sale_list) {
			System.out.println(s.toString());
		}
		return 0;
	}

	public int prtAllInventory() {
		for (Inventory i : inventory_list) {
			System.out.println(i.toString());
		}
		return 0;
	}

}
