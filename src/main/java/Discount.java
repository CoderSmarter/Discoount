import java.util.*;
/**
 * Created by Administrator on 2016/7/12.
 */
public class Discount {
    private static ProductList list = new ProductList();
    private static String[] DiscountProduct = new String[3];
    static
    {
        DiscountProduct[0] = "ITEM000001";
        DiscountProduct[1] = "ITEM000002";
        DiscountProduct[2] = "ITEM000003";
    }

    private static String[] PurchaseList = new String[3];
    static
    {
        PurchaseList[0] = "ITEM000001";
        PurchaseList[1] = "ITEM000002-2";
        PurchaseList[2] = "ITEM000005-5";
    }

    public static void main(String[] args)
    {
        double totalprice = 0;
        double totaldiscountprice = 0;
        for (String item : PurchaseList)
        {
            PurchaseItem iteminfo = ParseOneItem(item);
            System.out.print("名称：" + iteminfo.getIteminfo().getName() +
                            "，数量：" + iteminfo.getItemnum() + iteminfo.getIteminfo().getUnit() +
                            "，单价：" + iteminfo.getIteminfo().getPrice() + "（元）" +
                            "，小计：" + (iteminfo.getRealprice() - iteminfo.getDiscountprice()) + "（元）");
            if (iteminfo.getDiscountprice() != 0)
                System.out.print("，优惠：" + iteminfo.getDiscountprice() + "（元）");
            System.out.println();
            totalprice += iteminfo.getRealprice() - iteminfo.getDiscountprice();
            totaldiscountprice += iteminfo.getDiscountprice();
        }

        System.out.println("总计：" + totalprice + "（元），优惠：" + totaldiscountprice + "（元）");
    }

    public static PurchaseItem ParseOneItem(String itemtoparse)
    {
        PurchaseItem item = new PurchaseItem();
        int pos = itemtoparse.indexOf('-');
        String barcode = null;
        int productitemnum = 0;
        if (pos == -1)
        {
            barcode = itemtoparse;
            productitemnum = 1;
        }
        else
        {
            barcode = itemtoparse.substring(0, pos);
            String rest = itemtoparse.substring(pos + 1);
            productitemnum = Integer.parseInt(rest);
        }

        boolean bDiscount = false;
        for (String dp : DiscountProduct)
        {
            if (dp.equals(barcode))
                bDiscount = true;
        }

        ProductInfo iteminfo = list.getProductItemInfo(barcode);
        double discountprice;
        if (bDiscount) {
            discountprice = iteminfo.getPrice() * productitemnum * 0.1;
        }
        else discountprice = 0;

        item.setIteminfo(iteminfo);
        item.setItemnum(productitemnum);
        item.setDiscountprice(discountprice);
        item.setRealprice(iteminfo.getPrice() * productitemnum);

        return item;
    }
}
