import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2016/7/3.
 */
public class HelloWorldTest {
    private final int COCOLA_NUM = 3;
    private final BigDecimal COCOLA_PRICE = new BigDecimal(3);

    private final int BADMINTON_NUM = 5;
    private final BigDecimal BADMINTON_PRICE = new BigDecimal(1);

    private final int APPLE_NUM = 2;
    private final BigDecimal APPLE_PRICE = new BigDecimal(5.5);

    private final String FIVE_PERCENT_DISCOUNT = "FIVE_PERCENT_DISCOUNT";
    private final String  TEN_PERCENT_DICOUNT= "TEN_PERCENT_DISCOUNT";
    private final String  NO_DISCOUNT = "NO_DISCOUNT";
    @org.junit.Test
    public void should_return_totallfee_cocola() throws Exception {
        assertTrue(new Cocola(COCOLA_NUM,COCOLA_PRICE).getTotalFee().equals(new BigDecimal(9)));
    }
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
    //苹果
//    @org.junit.Test
//    public void should_return_totallfee_apple() throws Exception {
////        assertTrue(new Apple(APPLE_NUM,APPLE_PRICE).getTotalFee().equals(new BigDecimal(11)));
//        assertEquals(new BigDecimal(11.0), new Apple(APPLE_NUM,APPLE_PRICE).getTotalFee());
//    }
//    @org.junit.Test
//    public void should_return_discountfee_apple() throws Exception {
//        assertTrue(new Badminton(COCOLA_NUM,COCOLA_PRICE).getDiscountFee(NO_DISCOUNT).equals(new BigDecimal(0.5)));
//    }
}
