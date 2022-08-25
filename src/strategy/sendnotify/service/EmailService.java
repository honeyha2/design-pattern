package strategy.sendnotify.service;

import java.util.List;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class EmailService implements Iservice {
    String email;
    List<String> titles;
    List<String> contents;

    public EmailService(String email, List<String> titles, List<String> contents) {
        this.email = email;
        this.titles = titles;
        this.contents = contents;
    }

    @Override
    public boolean send() {
        System.out.println("Sending email to " + email + ", titles is " + titles + ", contents is " + contents);
        return true;
    }
}