/**
 * Created by Administrator on 2016/7/14.
 */
public class ProductInput {
    public static void main(String[] args){
        Cart car = new Cart("购物车","购物清单");
        ProductInfo pro1 = new ProductInfo("可口可乐",3,3,false,0.95f);
        ProductInfo pro2 = new ProductInfo("羽毛球",1,5,false,0.9f);
        ProductInfo pro3 = new ProductInfo("苹果",5.5,2,true,1);
        ProductOrder order = new ProductOrder(new ProductInfo[]{pro1,pro2,pro3},car);
        System.out.println(order.printOrder());
        System.out.println("控制台有输出吗？");
        System.out.println("怎么回事？");
    }
}
