package strategy.sendnotify.service;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class SmsService implements Iservice {
    String phoneNumber;
    String content;

    public SmsService(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    @Override
    public boolean send() {
        System.out.println("Sending sms to " + phoneNumber + ", contents is " + content);
        return true;
    }
}
