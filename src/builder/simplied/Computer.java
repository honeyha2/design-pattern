package builder.simplied;


/**
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1376414781669409
 * https://zhuanlan.zhihu.com/p/58093669
 * <p>
 * 需要先构造builder，调用build方法时创建computer。所以builder只能设置为静态内部类
 * 如果设置为普通内部类，则创建builder前需要创建computer，违背了构造者模式的初衷
 * <p>
 * 当一个类的构造函数参数个数超过4个，而且这些参数有些是可选的参数，考虑使用构造者模式
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-16
 */
public class Computer {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder {
        private String cpu;//必须
        private String ram;//必须
        private int usbCount;//可选
        private String keyboard;//可选
        private String display;//可选

        public Builder() {

        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}