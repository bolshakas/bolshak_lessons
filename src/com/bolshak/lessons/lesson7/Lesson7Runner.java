package com.bolshak.lessons.lesson7;

public class Lesson7Runner {
    public static void main(String[] args) {
        Device device = new Device(12.2, "aa01", "Xiaomi");
        Device device1 = new Device(12.2, "aa01", "Xiaomi");
        System.out.println(device);

        Device deviceMonitor1 = new Monitor(17.2, "mm2", "Apple", 1024, 768);
        Device deviceMonitor2 = new Monitor(17.2, "mm2", "Apple", 1078, 768);

        System.out.println(device);

        System.out.println(device.equals(device1));

        System.out.println(deviceMonitor1.equals(deviceMonitor2));

        System.out.println("Hash device "+device.hashCode());
        System.out.println("Hash device "+device1.hashCode());
        System.out.println("Hash monitor "+deviceMonitor1.hashCode());
        System.out.println("Hash monitor "+deviceMonitor2.hashCode());

    }
}
