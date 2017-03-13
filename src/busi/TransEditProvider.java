package busi;

public class TransEditProvider extends TransAbs {
	String provider_no;// �����̱��
	String provider_name;// ����������
	String provider_addr;// �����̵�ַ
	String provider_tel;// �����̵绰
	String provider_status;

	public TransEditProvider() {
		super();

	}

	public TransEditProvider(String provider_no, String provider_name, String provider_addr, String provider_tel) {
		super();
		this.provider_no = provider_no;
		this.provider_name = provider_name;
		this.provider_addr = provider_addr;
		this.provider_tel = provider_tel;
	}

	public void prtPrompt() {
		System.out.println("��������Ϣ�޸�|���������й����̱�ź��޸ĺ����Ϣ��");
		System.out.println("@provider_no @provider_name @provider_addr @provider_tels @provider_status");

	}

	public int getInput() {
		// �����̱��
		provider_no = scan.next();
		if (provider_no == null) {
			setTrans_result("��ȡ�����̱�Ŵ���");
			return -1;
		}

		// ����������
		provider_name = scan.next();
		if (provider_name == null) {
			setTrans_result("��ȡ���������ƴ���");
			return -1;
		}

		// �����̵�ַ
		provider_addr = scan.next();
		if (provider_addr == null) {
			setTrans_result("��ȡ�����̵�ַ����");
			return -1;
		}

		// �����̵绰
		provider_tel = scan.next();
		if (provider_tel == null) {
			setTrans_result("��ȡ�����̵绰����");
			return -1;
		}

		// ������״̬
		provider_status = scan.next();
		if (provider_status == null) {
			setTrans_result("��ȡ������״̬����");
			return -1;
		}
		return 0;
	}

	public int doTrans() {
		Provider provider = dbhelper.exactFindProvider(provider_no);
		provider.setProvider_name(provider_name);
		provider.setProvider_addr(provider_addr);
		provider.setProvider_tel(provider_tel);
		provider.setProvider_status(provider_status);
		setTrans_result("�޸ĳɹ�");

		return 0;
	}

	public void prtResult() {
		System.out.println(trans_result);
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

	public String getProvider_status() {
		return provider_status;
	}

	public void setProvider_status(String provider_status) {
		this.provider_status = provider_status;
	}

}