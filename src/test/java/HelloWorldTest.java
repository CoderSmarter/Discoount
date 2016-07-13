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

//  @org.junit.Test
//   public void should_return_totallfee_cocola() throws Exception {
//        assertTrue(new Cocola(COCOLA_NUM,COCOLA_PRICE).getTotalFee().equals(new BigDecimal(9)));
//   }
//    @org.junit.Test
//    public void should_return_discountfee_cocola() throws Exception {
//        assertTrue(new Cocola(COCOLA_NUM,COCOLA_PRICE).getDiscountFee(FIVE_PERCENT_DISCOUNT).equals(new BigDecimal(0.45)));
//    }

    //羽毛球
//    @org.junit.Test
//    public void should_return_totallfee_badminton() throws Exception {
//        assertTrue(new Badminton(BADMINTON_NUM,BADMINTON_PRICE).getTotalFee().equals(new BigDecimal(5)));
//    }
//    @org.junit.Test
//    public void should_return_discountfee_badminton() throws Exception {
//        assertTrue(new Badminton(COCOLA_NUM,COCOLA_PRICE).getDiscountFee(TEN_PERCENT_DICOUNT).equals(new BigDecimal(0.5)));
//    }

//    @org.junit.Test
//    public void should_return_discountfee_apple() throws Exception {
//        assertTrue(new Badminton(COCOLA_NUM,COCOLA_PRICE).getDiscountFee(NO_DISCOUNT).equals(new BigDecimal(0.5)));
//    }
}
