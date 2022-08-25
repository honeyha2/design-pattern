package strategy.sendnotify.service;

import java.util.List;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class StationLetterService implements Iservice {
    long accountId;
    List<String> titles;
    List<String> contents;

    public StationLetterService(long accountId, List<String> titles, List<String> contents) {
        this.accountId = accountId;
        this.titles = titles;
        this.contents = contents;
    }

    @Override
    public boolean send() {
        System.out.println(
                "Sending stationLetter to " + accountId + ", titles is " + titles + ", contents is " + contents);
        return true;
    }
}
