package busi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TransAddSale extends TransAbs {
    String goods_no;// ��Ʒ���
    String goods_name;// ��Ʒ����
    int sale_count;// ��������
    String goods_unit;
    double sale_price;// ���ۼ۸�
    Date sale_date;// ��������

//    public void deleteInventory(Sale sale) {//ɾ�����
//        Inventory inventory = dbhelper.exactFindInventory(sale.getGoods_no());
//        List inventoryList = dbhelper.getInventory_list();
//        inventoryList.remove(inventory);
//    }

    public int findGoodsInfo(String no) {
        Inventory inventory = dbhelper.exactFindInventory(no);
        if (inventory == null) {
            setTrans_result("�Ҳ�������Ʒ��ţ�");
            return -1;
        } else {
            System.out.println("����Ʒ��Ϣ���£�");
            System.out.println("goods_no[" + inventory.getGoods_no() + "],");
            System.out.println("goods_name[" + inventory.getGoods_name() + "],");
            System.out.println("Goods_count[" + inventory.getGoods_count() + "]");

        }

        return 0;
    }

    public void prtPrompt() {
        System.out.println("������Ʒ��ţ�");
        goods_no = scan.next();
        if (findGoodsInfo(goods_no) == 0) {
            System.out.println("����¼��|������������Ϣ��");
            System.out.println("@goods_no @goods_name @sale_count @goods_unit @sale_price @sale_date(yyyy-mm-dd)");
        }
    }

    public int getInput() {

        goods_no = scan.next();
        if (goods_no == null) {
            setTrans_result("��ȡ��Ʒ��Ŵ���");
            return -1;
        }

        // ��ȡ��Ʒ����
        goods_name = scan.next();
        if (goods_name == null) {
            setTrans_result("��ȡ��Ʒ���ƴ���");
            return -1;
        }

        // ��ȡ��������
        String count = scan.next();
        sale_count = Integer.parseInt(count);
        Inventory inventory = dbhelper.exactFindInventory(goods_no);
        if (sale_count > inventory.getGoods_count()) {
            setTrans_result("��治�㣡");
            return -1;
        }

        goods_unit = scan.next();
        if (goods_unit == null) {
            setTrans_result("��ȡ��Ʒ��λ����");
            return -1;
        }

        sale_price = Double.parseDouble(scan.next());
        if (sale_price > inventory.getGoods_price()) {
            setTrans_result("��������ۼ۴��ڽ��ۣ�");
            return -1;
        }

        if (scan.hasNext()) {
            DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            try {
                sale_date = date.parse(scan.next());
            } catch (Exception e) {
            }
            if (sale_date.before(inventory.getPurchase_date())) {
                System.out.println("�����������ʱ�����ڽ���ʱ�䣡");
            }
        } else {
            System.out.println("��������ڸ�ʽ����");
            return -1;
        }

        return 0;
    }

    public int doTrans() {

        Sale sale = new Sale();
        sale.setGoods_no(goods_no);
        sale.setGoods_name(goods_name);
        sale.setPrice(sale_price);
        sale.setSale_amt(sale_count);
        sale.setSale_date(sale_date);
//        deleteInventory(sale);//�ӿ����ɾ��
        if (getDbhelper().insertSale(sale) == 0) {
            getDbhelper().prtAllSale();
            setTrans_result("������Ϣ¼��ɹ�");
            return 0;
        } else {
            setTrans_result("������Ϣ¼��ʧ��");
            return -1;
        }

    }

    public void prtResult() {
        System.out.println(trans_result);
    }

}
