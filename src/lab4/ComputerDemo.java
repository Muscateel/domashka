package lab4;

enum Brand {
    ACER, ASUS, DELL, HP, LENOVO
}
class Processor {
    private String model;
    private double clockSpeedGHz;

    public Processor(String model, double clockSpeedGHz) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public void upgradeProcessor(String newModel, double newClockSpeedGHz) {
        model = newModel;
        clockSpeedGHz = newClockSpeedGHz;
    }
}

// Класс для описания памяти
class Memory {
    private int capacityGB;
    private String type;

    public Memory(int capacityGB, String type) {
        this.capacityGB = capacityGB;
        this.type = type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public String getType() {
        return type;
    }

    public void upgradeMemory(int newCapacityGB, String newType) {
        capacityGB = newCapacityGB;
        type = newType;
    }
}

// Класс для описания монитора
class Monitor {
    private String model;
    private double screenSizeInches;

    public Monitor(String model, double screenSizeInches) {
        this.model = model;
        this.screenSizeInches = screenSizeInches;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void upgradeMonitor(String newModel, double newScreenSizeInches) {
        model = newModel;
        screenSizeInches = newScreenSizeInches;
    }
}

// Класс для описания компьютера
class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void upgradeComputer(Processor newProcessor, Memory newMemory, Monitor newMonitor) {
        processor = newProcessor;
        memory = newMemory;
        monitor = newMonitor;
    }

    @Override
    public String toString() {
        return "Computer [Brand: " + brand + ", Processor: " + processor.getModel() +
                ", Memory: " + memory.getCapacityGB() + "GB " + memory.getType() +
                ", Monitor: " + monitor.getModel() + "]";
    }
}

public class ComputerDemo {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.2);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp", 27.0);
        Computer computer = new Computer(Brand.DELL, processor, memory, monitor);

        System.out.println("Информация о компьютере:");
        System.out.println(computer);

        // Обновление компьютера
        processor.upgradeProcessor("Intel Core i9", 4.0);
        memory.upgradeMemory(32, "DDR5");
        monitor.upgradeMonitor("ASUS ProArt", 32.0);

        computer.upgradeComputer(processor, memory, monitor);

        System.out.println("\nИнформация о компьютере после обновления:");
        System.out.println(computer);
    }
}
