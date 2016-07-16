import java.math.BigDecimal;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2016/7/3.
 */
public class HelloWorldTest {
    @org.junit.Test
    public void should_return_productinfo_ProductList() throws Exception
    {
        ProductList list = new ProductList();
        ProductInfo info = list.getProductItemInfo("ITEM000001");
        //assertEquals(info.getBarcode(), "ITEM000001");
        assertEquals(info.getName(), "篮球");
    }

    @org.junit.Test
    public void should_return_discount_itemcount() throws Exception
    {
        Discount discount = new Discount();
        PurchaseItem item = discount.ParseOneItem("ITEM000001-2");
        assertEquals(item.getRealprice(), 196, 0.1);
    }
}
