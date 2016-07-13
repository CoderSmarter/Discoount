import java.util.*;
/**
 * Created by Administrator on 2016/7/12.
 */
public class Discount {
    ProductList list = new ProductList();
    private String[] DiscountProduct = new String[3];
    {
        DiscountProduct[0] = "ITEM000001";
        DiscountProduct[1] = "ITEM000002";
        DiscountProduct[2] = "ITEM000003";
    }

    private String[] PurchaseList = new String[3];
    {
        PurchaseList[0] = "ITEM000001";
        PurchaseList[1] = "ITEM000002-2";
        PurchaseList[2] = "ITEM000005-5";
    }

    public static void main(String[] args)
    {

    }

    public PurchaseItem ParseOneItem(String itemtoparse)
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
