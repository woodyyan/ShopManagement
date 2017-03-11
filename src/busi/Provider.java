package busi;

public class Provider {
	String provider_no;// 供货商编号
	String provider_name;// 供货商名称
	String provider_addr;// 供货商地址
	String provider_tel;// 供货商电话
	int provider_status;// 状态

	public int addProvider() {
		return 0;
	}

	public int editProvider() {
		return 0;
	}

	public int delProvider() {
		return 0;
	}

	public int queryProvider(String prvd_no) {
		return 0;
	}

	public String getProvider_no() {
		return provider_no;
	}

	public void setProvider_no(String provider_no) {
		this.provider_no = provider_no;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}

	public String getProvider_addr() {
		return provider_addr;
	}

	public void setProvider_addr(String provider_addr) {
		this.provider_addr = provider_addr;
	}

	public String getProvider_tel() {
		return provider_tel;
	}

	public void setProvider_tel(String provider_tel) {
		this.provider_tel = provider_tel;
	}

	public int getProvider_status() {
		return provider_status;
	}

	public void setProvider_status(int provider_status) {
		this.provider_status = provider_status;
	}

}
