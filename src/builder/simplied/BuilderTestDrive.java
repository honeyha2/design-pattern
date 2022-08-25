package builder.simplied;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-16
 */
public class BuilderTestDrive {

    public static void main(String[] args) {
        Computer computer =
                new Computer.Builder().setCpu("因特尔").setRam("三星").setDisplay("三星24寸").setKeyboard("三星24寸")
                        .setUsbCount(2).build();
    }
}
