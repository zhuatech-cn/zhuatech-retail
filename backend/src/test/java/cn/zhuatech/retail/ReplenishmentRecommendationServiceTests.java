/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.retail;
import cn.zhuatech.retail.service.ReplenishmentRecommendationService;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
class ReplenishmentRecommendationServiceTests {private final ReplenishmentRecommendationService service=new ReplenishmentRecommendationService();
 @Test void roundsOrderToMinimumLot(){var r=service.recommend(new ReplenishmentRecommendationService.Request("S1",20,0,10,5,2,200,12));assertEquals(60,r.recommendedOrder());assertEquals("ORDER_NOW",r.status());}
 @Test void avoidsOrderWithEnoughStock(){var r=service.recommend(new ReplenishmentRecommendationService.Request("S2",100,0,10,5,2,200,12));assertEquals("NO_ORDER",r.status());}}
