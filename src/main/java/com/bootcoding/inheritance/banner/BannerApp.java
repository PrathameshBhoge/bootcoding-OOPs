package com.bootcoding.inheritance.banner;

public class BannerApp {
    public static void main(String[] args) {
        FlexBanner fb=new FlexBanner();
        fb.color="White";
        fb.Content="New Batch is Strating from monday. ";
        fb.type="Flex";
        fb.material="plastic";
        fb.shape="Long rectangle";
        fb.size="16*10";
        fb.price=5000.00;

        fb.create();
        System.out.println(fb.color);
        System.out.println(fb.Content);
        System.out.println(fb.type);
        System.out.println(fb.material);
        System.out.println(fb.shape);
        System.out.println(fb.size);
        System.out.println(fb.price);

        fb.display();


    }
}
