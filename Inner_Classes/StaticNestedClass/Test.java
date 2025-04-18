package Inner_Classes.StaticNestedClass;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer", "7 series", "Windows 10 Pro");
        computer.getOs().displayInfo();

        // As USB is static, so I don't have to create an object for Computer first.
        // I can create the object of static class USB directly.
        Computer.USB usb = new Computer.USB("TYPE-C");
        usb.displayUSBType();
    }
}
