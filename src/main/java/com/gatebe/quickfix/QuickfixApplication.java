package com.gatebe.quickfix;

import com.gatebe.quickfix.service.ApplicationMessageCracker;
import com.gatebe.quickfix.service.ClientApplicationAdapter;
import io.allune.quickfixj.spring.boot.starter.EnableQuickFixJClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import quickfix.*;

@EnableQuickFixJClient
@SpringBootApplication
public class QuickfixApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickfixApplication.class, args);
    }

    @Bean
    public Application clientApplication(MessageCracker messageCracker) {
        return new ClientApplicationAdapter(messageCracker);
    }

    @Bean
    public MessageCracker messageCracker() {
        return new ApplicationMessageCracker();
    }

    @Bean
    public Initiator clientInitiator(quickfix.Application clientApplication, MessageStoreFactory clientMessageStoreFactory,
                                     SessionSettings clientSessionSettings, LogFactory clientLogFactory,
                                     MessageFactory clientMessageFactory) throws ConfigError {

        return new ThreadedSocketInitiator(clientApplication, clientMessageStoreFactory, clientSessionSettings,
                clientLogFactory, clientMessageFactory);
    }

    @Bean
    public LogFactory clientLogFactory(SessionSettings clientSessionSettings) {
        return new FileLogFactory(clientSessionSettings);
    }

}
