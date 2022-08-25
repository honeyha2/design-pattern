package iterator;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public interface Menu {

    <T> T getMenuItems();

    Iterator getIterator();

    void setIterator(Iterator iterator);
}