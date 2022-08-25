package iterator;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public interface Iterator {
    boolean hasNext();

    MenuItem next();
}