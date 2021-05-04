package com.hx.mall.api;

import com.hx.mall.common.PBKDF2;
import com.hx.mall.pojo.ShopInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class MallApiApplicationTests {

//    @Resource
//    private ShopInfoMapper shopInfoMapper;

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
        shopInfo.setShopId(1001L);
        ShopInfo shop = shopInfo.selectById();
        boolean verify = PBKDF2.verify("1232qwe", shop.getSalt(), shop.getPasswordHash());
        System.out.println("verify = " + verify);
    }
    @Test
    void selectOperate(){
        List<ShopInfo> list = new ShopInfo().selectAll();
        for (ShopInfo shopInfo : list) {
            System.out.println(shopInfo);
        }
        log.error("error...........");
        log.warn("warn...........");
        log.info("info...........");
        log.debug("debug..........");
    }
    @Test
    void updateOperate(){
        ShopInfo shop = new ShopInfo();
        shop.setShopId(1001L);
        shop.setShopName("高端家具旗舰店");
        shop.setSellerName("张三");
        shop.setPhone("18594036685");
        shop.setLocation("广西");
        if (shop.updateById()) {
            System.out.println("修改成功!");
        }
    }
}
