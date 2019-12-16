package com.example.demo.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * 健康检查，内部写一些判断是否处于健康状态
 */
@Component
public class HealthCheck extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.down().withDetail("status", false);
//        builder.up().withDetail("status", true);
    }
}
