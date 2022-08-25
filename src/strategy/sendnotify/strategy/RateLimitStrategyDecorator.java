package strategy.sendnotify.strategy;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public abstract class RateLimitStrategyDecorator implements RateLimitStrategy {
    RateLimitStrategy rateLimitStrategy;
}
