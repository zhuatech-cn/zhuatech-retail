/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.retail.service;
import jakarta.validation.constraints.*;import org.springframework.stereotype.Service;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Service public class ReplenishmentRecommendationService {
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 public Result recommend(Request r){int target=(int)Math.ceil(r.averageDailySales()*(r.leadTimeDays()+r.safetyDays()));int position=r.onHand()+r.onOrder();int shortage=Math.max(0,target-position);int rounded=shortage==0?0:(int)Math.ceil(shortage/(double)r.minimumOrderQuantity())*r.minimumOrderQuantity();int capacity=Math.max(0,r.shelfCapacity()-r.onHand());int recommended=Math.min(rounded,capacity);double cover=Math.round(r.onHand()/r.averageDailySales()*10.0)/10.0;String status=shortage==0?"NO_ORDER":recommended<rounded?"CAPACITY_REVIEW":"ORDER_NOW";return new Result(target,position,shortage,recommended,cover,status);}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 public record Request(@NotBlank String sku,@Min(0) int onHand,@Min(0) int onOrder,@DecimalMin("0.1") double averageDailySales,@Min(1) int leadTimeDays,@Min(0) int safetyDays,@Min(1) int shelfCapacity,@Min(1) int minimumOrderQuantity){}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 public record Result(int targetStock,int inventoryPosition,int shortage,int recommendedOrder,double daysOfCover,String status){}
}
