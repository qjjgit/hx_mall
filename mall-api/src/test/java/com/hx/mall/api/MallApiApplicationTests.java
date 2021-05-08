package com.hx.mall.api;

import com.hx.mall.common.PBKDF2;
import com.hx.mall.mapper.ShopInfoMapper;
import com.hx.mall.pojo.ShopInfo;
import com.hx.mall.service.ShopInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.List;

@SpringBootTest
@Slf4j
class MallApiApplicationTests {

    @Autowired
    private ShopInfoService shopInfoService;

    @Test
    void insertOperate() {
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopName("服饰旗舰店");
        shopInfo.setSalt(PBKDF2.getSalt());
        shopInfo.setPasswordHash(PBKDF2.getPBKDF2("123qwe",shopInfo.getSalt()));
        shopInfo.setSellerName("尼古拉斯");
        shopInfo.setPhone("18594038585");
        shopInfo.setLocation("上海");
        if (shopInfo.insert()) System.out.println("添加成功!");
    }
    @Test
    void verify(){
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopId(1002L);
        ShopInfo shop = shopInfo.selectById();
        boolean verify = PBKDF2.verify("1232qwe", shop.getSalt(), shop.getPasswordHash());
        System.out.println("verify = " + verify);
    }
    @Test
    void select1Operate(){
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopId(1001L);
        ShopInfo shop = shopInfoService.getById(shopInfo);
        System.out.println(shop);
    }
    @Test
    void selectOperate(){
        List<ShopInfo> list = new ShopInfo().selectAll();
        for (ShopInfo shopInfo : list) {
            System.out.println(shopInfo);
        }
    }
    @Test
    void updateOperate(){
        ShopInfo shop = new ShopInfo();
        shop.setShopId(1002L);
        shop.setShopName("外设旗舰店");
        shop.setSellerName("李四");
        shop.setPhone("18594036685");
        shop.setLocation("北京");
        if (shopInfoService.saveOrUpdate(shop)) {
            System.out.println("修改成功!");
        }
    }
    @Test
    void delOperate(){
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopId(1001L);
        boolean ok = shopInfoService.removeById(shopInfo);
        if (ok) System.out.println("del success");
    }
}
