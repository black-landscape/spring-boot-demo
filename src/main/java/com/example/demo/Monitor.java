package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.influxdb.InfluxDB;
import org.influxdb.dto.Point;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
@Slf4j
public class Monitor {
    private InfluxDB influxDB;

    @Scheduled(fixedDelay = 5000)
    public void writeQPS() {
        int count = (int) (Math.random() * 100);

        Point point = Point.measurement("ApiQPS")
                .tag("url", "/hello")
                .addField("count", count)
                .time(System.currentTimeMillis(), TimeUnit.MILLISECONDS)
                .build();

        influxDB.write("test", "autogen", point);
        log.info("上报统计数据: {}", count);
    }
}
