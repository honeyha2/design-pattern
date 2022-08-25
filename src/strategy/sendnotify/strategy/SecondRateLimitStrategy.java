package strategy.sendnotify.strategy;

import java.util.Objects;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class SecondRateLimitStrategy extends RateLimitStrategyDecorator {
    private int threshold;

    private int counter;

    public SecondRateLimitStrategy(RateLimitStrategy rateLimitStrategy) {
        threshold = 2;
        counter = 0;
        this.rateLimitStrategy = rateLimitStrategy;
    }

    @Override
    public boolean limit() {
        System.out.println("i am SecondRateLimitStrategy");
        counter++;
        boolean isLimited = counter > threshold;
        if (!Objects.isNull(rateLimitStrategy)) {
            isLimited = isLimited || rateLimitStrategy.limit();
        }
        return isLimited;
    }
}
