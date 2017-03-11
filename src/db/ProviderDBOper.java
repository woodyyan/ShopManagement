package db;

import java.util.ArrayList;
import java.util.List;

import busi.Provider;

public class ProviderDBOper {
	List<Provider> provider_list;

	public ProviderDBOper() {

		provider_list = new ArrayList<Provider>();
	}

	public int insertProvider(Provider p) {
		provider_list.add(p);
		return 0;
	}

	public int delProvider(Provider p) {
		for (int i = 0; i < provider_list.size(); i++) {
			String provider_no = provider_list.get(i).getProvider_no();// 当前对象商品编号
			String del_provider_no = p.getProvider_no();// 要删除的商品编号
			if (provider_no.equals(del_provider_no)) {
				provider_list.remove(i);
			}
		}
		return 0;
	}

	public int prtAllProvider() {
		for (Provider p : provider_list) {
			System.out.println(p.toString());
		}
		return 0;
	}

}
