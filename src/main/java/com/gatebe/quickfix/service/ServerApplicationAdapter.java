//package com.gatebe.quickfix.service;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import quickfix.Application;
//import quickfix.Message;
//import quickfix.SessionID;
//
///**
// * @author huml
// * @version 1.0
// * @date 2022/5/19 17:37
// * @description model-center-example
// */
//@Slf4j
//@Service
//public class ServerApplicationAdapter implements Application {
//
//    @Override
//    public void fromAdmin(Message message, SessionID sessionId) {
//        log.info("fromAdmin: Message={}, SessionId={}", message, sessionId);
//    }
//
//    @Override
//    public void fromApp(Message message, SessionID sessionId) {
//        log.info("fromApp: Message={}, SessionId={}", message, sessionId);
//    }
//
//    @Override
//    public void onCreate(SessionID sessionId) {
//        log.info("onCreate: SessionId={}", sessionId);
//    }
//
//    @Override
//    public void onLogon(SessionID sessionId) {
//        log.info("onLogon: SessionId={}", sessionId);
//    }
//
//    @Override
//    public void onLogout(SessionID sessionId) {
//        log.info("onLogout: SessionId={}", sessionId);
//    }
//
//    @Override
//    public void toAdmin(Message message, SessionID sessionId) {
//        log.info("toAdmin: Message={}, SessionId={}", message, sessionId);
//    }
//
//    @Override
//    public void toApp(Message message, SessionID sessionId) {
//        log.info("toApp: Message={}, SessionId={}", message, sessionId);
//    }
//
//}
