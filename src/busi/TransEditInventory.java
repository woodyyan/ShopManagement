package busi;

import java.util.Date;

/**
 * Created by Woody on 2017/3/13.
 */
public class TransEditInventory extends TransAbs {
    String goods_no;// 商品编号
    String goods_name;// 商品名称
    int goods_count;// 商品数量
    String goods_unit;// 商品单位
    double goods_price;// 进货价格
    Date purchase_date;// 进货日期
    Inventory inventory;
    Sale sale;


    public void prtPrompt() {
        System.out.println("库存信息修改|请输入商品编号");

    }

    public int getInput() {
        // 商品编号
        goods_no = scan.next();
        if (goods_no == null) {
            setTrans_result("读取商品编号错误");
            return -1;
        }
        inventory = dbhelper.exactFindInventory(goods_no);
        sale = dbhelper.exactFindSale(goods_no);
        return 0;
    }

    public int doTrans() {
        int changedAmt = inventory.getGoods_count() - sale.getSale_amt();
        inventory.setGoods_count(changedAmt);
        setTrans_result("修改成功");

        return 0;
    }

    public void prtResult() {
        System.out.println(trans_result);
    }

}

