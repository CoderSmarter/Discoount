class ProductOrder {
    ProductInfo pro[];
    Cart        car;
    ProductOrder(ProductInfo[] pro,Cart car){
        this.pro = pro;
        this.car = car;
    }
    String printOrder(){
        return "购物车信息："+car.getInfo()+"\n"+
                "购物清单："+this.getProInfo()+"\n"+
                "===商品总价："+this.getProSumMoney()+"\n"+
                "===优惠后总价："+this.getDiscountMoney()+"\n";
    }
    String getProInfo(){
        String info = " ";
        for(int i = 0;i<pro.length;i++){
            info+=pro[i].getInfo();
        }
        return info;
    }
    double getProSumMoney(){
        double sum = 0;
        for(int i = 0;i<pro.length;i++){
            sum = sum + pro[i].getSumMoney();
        }
        return sum;
    }
    double getDiscountMoney(){
        double sum = 0;
        for(int i=0;i<pro.length;i++){
            if(car.type.equals("购物清单")&&!pro[i].type&&pro[i].discount==0.95f){
                sum+=pro[i].getSumMoney()*0.95;
            }else if(car.type.equals("购物清单")&&!pro[i].type&&pro[i].discount==0.90f){
                sum+=pro[i].getSumMoney()*0.9;
            }else {
                sum+=pro[i].getSumMoney()*1;
            }
        }
            return sum;
    }
}