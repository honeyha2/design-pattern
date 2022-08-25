package proxy.demo;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-30
 */
public interface Person {
    String getName();

    String getGender();

    String getInterests();

    int getGeekRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setGeekRating(int rating);
}
