package strategy.sendnotify;

import java.util.ArrayList;
import java.util.List;

import strategy.sendnotify.service.EmailService;
import strategy.sendnotify.service.Iservice;
import strategy.sendnotify.service.SmsService;
import strategy.sendnotify.service.StationLetterService;
import strategy.sendnotify.strategy.MinuteRateLimitStrategy;
import strategy.sendnotify.strategy.RateLimitStrategy;
import strategy.sendnotify.strategy.SecondRateLimitStrategy;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class TestDrive {

    public static void main(String[] args) {
        RateLimitStrategy minuteRateLimitStrategy = new MinuteRateLimitStrategy(null);
        RateLimitStrategy secondRateLimitStrategy = new SecondRateLimitStrategy(null);

        List<String> list = new ArrayList<>();

        Iservice emailService = new EmailService("lianchang@kuaishou.com", list, list);
        Iservice smsService = new SmsService("13388889999", "手机欠费");
        Iservice stationLetterService = new StationLetterService(1, list, list);

        Context context =
                new Context(emailService, minuteRateLimitStrategy);

        System.out.println(context.execute());
        System.out.println();

        context.setRateLimitStrategy(secondRateLimitStrategy);
        System.out.println(context.execute());
        System.out.println();

        RateLimitStrategy minuteAndSecondRateLimitStrategy =
                new SecondRateLimitStrategy(new MinuteRateLimitStrategy(null));
        context.setRateLimitStrategy(minuteAndSecondRateLimitStrategy);
        System.out.println(context.execute());
        System.out.println();

        context.setIservice(smsService);
        context.setRateLimitStrategy(minuteRateLimitStrategy);
        System.out.println(context.execute());
    }
}
