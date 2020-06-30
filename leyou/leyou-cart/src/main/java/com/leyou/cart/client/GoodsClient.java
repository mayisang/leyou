package com.leyou.cart.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author shkstart
 * @date 2020/4/9 - 13:51
 */
@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {
}