package ru.interg.redis.springbootintegrationredis.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface MessageGateway {
    @Gateway(requestChannel = "inputChannel")
    public <S> void sendMessage(S request);
}
