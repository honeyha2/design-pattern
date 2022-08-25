package strategy.sendnotify.strategy;

import java.util.Objects;

/**
 * 分钟粒度的限流器，每分钟不可超过100次
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class MinuteRateLimitStrategy extends RateLimitStrategyDecorator {

    private int threshold;

    private int counter;

    public MinuteRateLimitStrategy(RateLimitStrategy rateLimitStrategy) {
        threshold = 100;
        counter = 0;
        this.rateLimitStrategy = rateLimitStrategy;
    }

    @Override
    public boolean limit() {
        System.out.println("i am MinuteRateLimitStrategy");
        counter++;
        boolean isLimited = counter > threshold;
        if (!Objects.isNull(rateLimitStrategy)) {
            isLimited = isLimited && rateLimitStrategy.limit();
        }
        return isLimited;
    }
}
