package cn.van.order.service;

import cn.van.order.domain.OrderDomain;
import cn.van.order.result.RpcResult;

public interface OrderDubboService {
    RpcResult<OrderDomain> getOrder();
}