package strategy.sendnotify;

import java.util.List;

import javax.imageio.spi.IIOServiceProvider;

import strategy.sendnotify.service.EmailService;
import strategy.sendnotify.service.Iservice;
import strategy.sendnotify.strategy.RateLimitStrategy;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class Context {

    Iservice iservice;
    RateLimitStrategy rateLimitStrategy;

    public Context(Iservice iservice, RateLimitStrategy rateLimitStrategy) {
        this.iservice = iservice;
        this.rateLimitStrategy = rateLimitStrategy;
    }

    public boolean execute() {
        if (rateLimitStrategy.limit()) {
            return false;
        }
        return iservice.send();
    }

    public void setIservice(Iservice iservice) {
        this.iservice = iservice;
    }

    public void setRateLimitStrategy(RateLimitStrategy rateLimitStrategy) {
        this.rateLimitStrategy = rateLimitStrategy;
    }
}
