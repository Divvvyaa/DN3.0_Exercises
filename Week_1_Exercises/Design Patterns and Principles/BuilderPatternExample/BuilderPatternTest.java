public class BuilderPatternTest {

    public static void main(String[] args) {
        // Create a basic Computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "512GB SSD")
                .build();
        System.out.println("Basic Computer: ");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());
        System.out.println("Storage: " + basicComputer.getStorage());
        System.out.println("Has Graphics Card: " + basicComputer.hasGraphicsCard());
        System.out.println("Has WiFi: " + basicComputer.hasWiFi());
        System.out.println();

        // Create a Computer with all optional attributes
        Computer gamingComputer = new Computer.Builder("Intel i9", "16GB", "1TB SSD")
                .setGraphicsCard(true)
                .setWiFi(true)
                .build();
        System.out.println("Gaming Computer: ");
        System.out.println("CPU: " + gamingComputer.getCPU());
        System.out.println("RAM: " + gamingComputer.getRAM());
        System.out.println("Storage: " + gamingComputer.getStorage());
        System.out.println("Has Graphics Card: " + gamingComputer.hasGraphicsCard());
        System.out.println("Has WiFi: " + gamingComputer.hasWiFi());
    }
}
