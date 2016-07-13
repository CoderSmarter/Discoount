import java.util.*;

/**
 * Created by Administrator on 2016/7/12.
 */
public class ProductList {
    private ProductInfo[] productInfos = new ProductInfo[6];
    {
        productInfos[0] = new ProductInfo("ITEM000000", "可口可乐", "瓶", "食品", "碳酸饮料", 3.0);
        productInfos[1] = new ProductInfo("ITEM000001", "篮球", "个", "运动物品", "球类", 98.0);
        productInfos[2] = new ProductInfo("ITEM000002", "羽毛球", "个", "运动物品", "球类", 1.0);
        productInfos[3] = new ProductInfo("ITEM000003", "苹果", "斤", "食品", "水果", 5.5);
        productInfos[4] = new ProductInfo("ITEM000004", "白菜", "斤", "食品", "蔬菜", 5.0);
        productInfos[5] = new ProductInfo("ITEM000005", "牙膏", "盒", "日用品", "洗漱用品", 3.0);
    }

    public ProductInfo getProductItemInfo(String barcode)      //根据barcode返回商品信息
    {
        for (ProductInfo info : productInfos)
        {
            if (info.getBarcode().equals(barcode))
                return info;
        }
        return null;                                           //没有与该barcode对应的商品信息
    }
}
