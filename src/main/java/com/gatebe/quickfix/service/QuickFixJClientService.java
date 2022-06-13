package com.gatebe.quickfix.service;

import io.allune.quickfixj.spring.boot.starter.connection.ConnectorManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;

/**
 * @author huml
 * @version 1.0
 * @date 2022/6/12 19:31
 * @description quickfix
 */
@Slf4j
@Service
public class QuickFixJClientService implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    private ConnectorManager clientConnectorManager;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        log.info("ApplicationReady: start QuickFixJClient");
        Executors.newSingleThreadExecutor().execute(() -> clientConnectorManager.start());
    }

}
