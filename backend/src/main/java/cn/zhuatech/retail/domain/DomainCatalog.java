/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.retail.domain;
import org.springframework.stereotype.Component;
import java.util.List;
@Component public class DomainCatalog {
    public String systemName(){return "知华 Retail 连锁零售运营平台";}
    public String sceneName(){return "门店、商品、库存、促销与会员运营";}
    public List<SeedItem> seedItems(){return List.of(
        new SeedItem("RETAIL-20260801-001","虹桥店冷柜温度异常","处理中","门店运营组","紧急"),
        new SeedItem("RETAIL-20260801-002","周末促销价签复核","待处理","商品运营组","高"),
        new SeedItem("RETAIL-20260801-003","临期商品调拨闭环","已完成","库存管理组","中"),
        new SeedItem("RETAIL-20260801-004","会员券核销异常跟进","处理中","会员运营组","高"));}
    public List<String> recommendedActions(){return List.of("优先处理食品安全与设备异常","补齐畅销品并协调跨店调拨","复核促销价格和会员权益一致性");}
    public record SeedItem(String recordNo,String title,String status,String owner,String priority){}
}
