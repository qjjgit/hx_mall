package com.hx.mall.api.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.events.SessionCreatedEvent;
import org.springframework.session.events.SessionDeletedEvent;
import org.springframework.session.events.SessionExpiredEvent;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
@EnableRedisHttpSession(
        redisNamespace = "spring",
        maxInactiveIntervalInSeconds = 150)
public class SpringSessionConfiguration {
//    @Bean
//    public DefaultCookieSerializer defaultCookieSerializer() {
//        DefaultCookieSerializer defaultCookieSerializer = new DefaultCookieSerializer();
//        defaultCookieSerializer.setCookiePath("/");
//        return defaultCookieSerializer;
//    }
    /**
     * Redis内session过期事件监听
     */
    @EventListener
    public void onSessionExpired(SessionExpiredEvent expiredEvent) {
        System.out.println("session Expired");
        String sessionId = expiredEvent.getSessionId();
    }

    /**
     * Redis内session删除事件监听
     */
    @EventListener
    public void onSessionDeleted(SessionDeletedEvent deletedEvent) {
        System.out.println("session Deleted");
        String sessionId = deletedEvent.getSessionId();
    }

    /**
     * Redis内session保存事件监听
     */
    @EventListener
    public void onSessionCreated(SessionCreatedEvent createdEvent) {
        System.out.println("session Created");
        String sessionId = createdEvent.getSessionId();
    }
}
