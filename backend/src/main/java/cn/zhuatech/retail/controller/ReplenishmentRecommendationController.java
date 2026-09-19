/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.retail.controller;
import cn.zhuatech.retail.common.ApiResponse;import cn.zhuatech.retail.service.ReplenishmentRecommendationService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/retail/insights/replenishment") public class ReplenishmentRecommendationController {private final ReplenishmentRecommendationService service;/**
                                                                                                                                                                                    * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                    */
public ReplenishmentRecommendationController(ReplenishmentRecommendationService service){this.service=service;}/**
                                                                                                                                                                                                                                                                                                   * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                                   */
@PostMapping ApiResponse<ReplenishmentRecommendationService.Result> recommend(@Valid @RequestBody ReplenishmentRecommendationService.Request request){return ApiResponse.ok(service.recommend(request));}}
