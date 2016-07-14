class ProductInfo{
    String name;
    double price;
    double num;
    boolean type;
    float discount;
    ProductInfo(String name,double price,double num,boolean type,float discount){
        this.name = name;
        this.price = price;
        this.num = num;
        this.type = type;
        this.discount = discount;
    }
    String getInfo(){
        String str = "普通商品";
        if(this.type){
            str = "打折商品";
        }
        return "商品名称:"+this.name+"\n"+
                "商品单价："+this.price+"\n"+
                "商品数量："+this.num+"\n"+
                "商品类型："+str+"\n"+
                "---小计:"+this.getSumMoney();
    }
    double getSumMoney(){
        return this.price * this.num;
    }
}
