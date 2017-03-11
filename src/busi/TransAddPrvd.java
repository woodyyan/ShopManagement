package busi;

public class TransAddPrvd extends TransAbs {
	String provider_no;// 供货商编号
	String provider_name;// 供货商名称
	String provider_addr;// 供货商地址
	String provider_tel;// 供货商电话

	public void prtPrompt() {
		System.out.println("添加供货商|请输入以下信息：");
		System.out.println("@provider_no @provider_name @provider_addr @provider_tel");
	};

	public int getInput() {
		// 读取供货商编号
		provider_no = scan.next();
		if (provider_no == null) {
			setTrans_result("获取供应商编号错误");
			return -1;
		}

		if (provider_name == null) {
			setTrans_result("获取供应商名称错误");
			return -1;
		}

		if (provider_addr == null) {
			setTrans_result("获取供应商地址错误");
			return -1;
		}

		if (provider_tel == null) {
			setTrans_result("获取供应商电话错误");
			return -1;
		}

		System.out.print("provider_no[" + provider_no + "],");
		System.out.print("provider_name[" + provider_name + "],");
		System.out.print("provider_addr[" + provider_addr + "]");
		System.out.print("provider_tel[" + provider_tel + "]");
		System.out.println();
		return 0;
	}

	public int doTrans() {
		Provider p = new Provider();
		p.setProvider_no(provider_no);
		p.setProvider_name(provider_name);
		p.setProvider_addr(provider_addr);
		p.setProvider_tel(provider_tel);
		if (getProviderDBOper().insertProvider(p) == 0) {
			setTrans_result("新增商品成功");
			return 0;
		} else {
			setTrans_result("新增商品失败");
			return -1;
		}
	}

	public void prtResult() {
		System.out.println(trans_result);
	}
}
