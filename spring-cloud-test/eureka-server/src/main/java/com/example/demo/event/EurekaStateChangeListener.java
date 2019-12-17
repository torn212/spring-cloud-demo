package com.example.demo.event;

import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EurekaStateChangeListener {
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        log.info("{},{},{}", "服务下线", event.getServerId(), event.getAppName());
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info("{},{},{}", "服务注册", instanceInfo.getAppName(), "注册成功");
    }
//
//    @EventListener
//    public void listen(EurekaInstanceRenewedEvent event) {
//        log.info(event.getServerId(), event.getAppName());
//    }
//
//    @EventListener
//    public void listen(EurekaRegistryAvailableEvent event) {
//        log.info("注册中心启动");
//    }
//
//    @EventListener
//    public void listen(EurekaServerStartedEvent event) {
//        log.info("服务启动");
//    }
}
