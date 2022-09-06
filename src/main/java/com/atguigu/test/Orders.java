package com.atguigu.test;

public class Orders {
    //属性
    private String oname;
    private String address;


//有参数的构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void testDemo(){
        System.out.println(oname+"::"+address);
    }
}
