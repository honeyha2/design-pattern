package strategy.sendnotify.strategy;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public interface RateLimitStrategy {
    boolean limit();
}
