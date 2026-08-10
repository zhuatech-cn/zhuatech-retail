/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.retail.controller;
import cn.zhuatech.retail.common.ApiResponse;import cn.zhuatech.retail.service.ReplenishmentRecommendationService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/retail/insights/replenishment") public class ReplenishmentRecommendationController {private final ReplenishmentRecommendationService service;public ReplenishmentRecommendationController(ReplenishmentRecommendationService service){this.service=service;}@PostMapping ApiResponse<ReplenishmentRecommendationService.Result> recommend(@Valid @RequestBody ReplenishmentRecommendationService.Request request){return ApiResponse.ok(service.recommend(request));}}
