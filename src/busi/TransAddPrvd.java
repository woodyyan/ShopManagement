package busi;

public class TransAddPrvd extends TransAbs {
	String prvd_no;// 供货商编号
	String prvd_name;// 供货商名称
	String prvd_addr;// 供货商地址
	String prvd_tel;// 供货商电话

	public void prtPrompt() {
		System.out.println("添加供货商|请输入以下信息：");
		System.out.println("@prvd_no @prvd_name @prvd_addr @prvd_tel");
	};

	public int getInput() {
		// 读取供货商编号
		prvd_no = scan.next();
		if (prvd_no == null) {
			setTrans_result("获取供应商编号错误");
			return -1;
		}

		if (prvd_name == null) {
			setTrans_result("获取供应商名称错误");
			return -1;
		}

		if (prvd_addr == null) {
			setTrans_result("获取供应商地址错误");
			return -1;
		}

		if (prvd_tel == null) {
			setTrans_result("获取供应商电话错误");
			return -1;
		}

		System.out.print("prvd_no[" + prvd_no + "],");
		System.out.print("prvd_name[" + prvd_name + "],");
		System.out.print("prvd_addr[" + prvd_addr + "]");
		System.out.print("prvd_tel[" + prvd_tel + "]");
		System.out.println();
		return 0;
	}

	public int doTrans() {
		Provider p = new Provider();// ？？？？？DBOper里面要再建一个<provider>集合吗？

		return 0;
	};

	public void prtResult() {
	};
}
