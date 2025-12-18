package cn.van.order.service.impl;

import cn.van.order.result.RpcResult;
import cn.van.order.service.OrderDubboService;
import cn.van.order.domain.OrderDomain;
import org.apache.dubbo.config.annotation.Service;

import java.time.LocalDateTime;

@Service
public class OrderDubboServiceImpl implements OrderDubboService {

    @Override
    public RpcResult<OrderDomain> getOrder() {
        return RpcResult.success(new OrderDomain(1, 10086, LocalDateTime.now()));
    }
}