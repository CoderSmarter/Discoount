import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ProductInfoTest {
    @Test
    public void test(){
        assertTrue(true);
    }
    @Test
    public void should_return_getSumMoney()throws Exception{
        ProductInfo pro1 = new ProductInfo("可口可乐",3,3,false,0.95f);
        ProductInfo pro2 = new ProductInfo("羽毛球",1,5,false,0.90f);
        ProductInfo pro3 = new ProductInfo("苹果",5.5,2,false,1);
        assertTrue(pro1.getSumMoney()==9);//equals 怎么使用的?
        assertTrue(pro2.getSumMoney()==5);
        assertTrue(pro3.getSumMoney()==11);
//        assertEquals(?,pro1.getSumMoney());//assertEquals 怎么使用的?
    }
    @Test
    public void should_return_getProSumMoney(){
        ProductInfo pro1 = new ProductInfo("可口可乐",3,3,false,0.95f);
        ProductInfo pro2 = new ProductInfo("羽毛球",1,5,false,0.90f);
        ProductInfo pro3 = new ProductInfo("苹果",5.5,2,false,1);
        ProductInfo pro[] = new ProductInfo[]{pro1,pro2,pro3};
//        assertTrue(pro[i].getSumMoney()==5);
    }
}
