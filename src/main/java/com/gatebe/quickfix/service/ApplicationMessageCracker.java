package com.gatebe.quickfix.service;

import lombok.extern.slf4j.Slf4j;
import quickfix.*;

/**
 * @author huml
 * @version 1.0
 * @date 2022/6/13 10:19
 * @description quickfix
 */
@Slf4j
public class ApplicationMessageCracker extends MessageCracker {

    @Override
    public void onMessage(Message message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        // super.onMessage(message, sessionID);

        // Handle the message here
        log.info("*****************");
        log.info("Message received for sessionID={}: {}", sessionID, message);
        log.info("*****************");
    }

}
