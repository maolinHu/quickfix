//package com.gatebe.quickfix.service;
//
//import io.allune.quickfixj.spring.boot.starter.connection.ConnectorManager;
//import io.allune.quickfixj.spring.boot.starter.model.*;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.event.EventListener;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.stereotype.Service;
//import quickfix.SessionID;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.Executors;
//
///**
// * @author huml
// * @version 1.0
// * @date 2022/6/12 16:52
// * @description quickfix
// */
//@Slf4j
//@Service
//public class EventService  {
//    private List<SessionID> sessionIds = new ArrayList<>();
//    @Autowired
//    private ConnectorManager clientConnectorManager;
//
//    @Async
//    public void startClient() {
//        Executors.newSingleThreadExecutor().execute(() -> clientConnectorManager.start());
//    }
//
//    @EventListener
//    public void listenFromAdmin(FromAdmin fromAdmin) {
//        log.info("fromAdmin: {}", fromAdmin);
//    }
//
//    @EventListener
//    public void listenFromApp(FromApp fromApp) {
//        log.info("fromApp: {}", fromApp);
//    }
//
//    @EventListener
//    public void listenOnCreate(Create create) {
//        sessionIds.add(create.getSessionId());
//        log.info("create: {}", create);
//    }
//
//    @EventListener
//    public void listenOnLogon(Logon logon) {
//        log.info("logon: {}", logon);
//    }
//
//    @EventListener
//    public void listenOnLogout(Logout logout) {
//        log.info("logout: {}", logout);
//    }
//
//    @EventListener
//    public void listenToAdmin(ToAdmin toAdmin) {
//        log.info("toAdmin: {}", toAdmin);
//    }
//
//    @EventListener
//    public void listenToApp(ToApp toApp) {
//        log.info("toApp: {}", toApp);
//    }
//
//    public List<SessionID> getSessions() {
//        return sessionIds;
//    }
//
//}
