package Inner_Classes.StaticNestedClass;

 public class Computer {

        private String brand;
        private String model;
        private OperatingSystem os;

        public Computer(String brand, String model, String  osName ) {
            this.brand = brand;
            this.model = model;
            os = new OperatingSystem(osName);
        }

    static class USB {
            private String Type;
            public USB(String Type) {
                this.Type = Type;
            }

            public void displayUSBType(){
                System.out.println("USB type: " + Type);
            }
    }

    public OperatingSystem getOs() {
        return os;
    }

    public class OperatingSystem { // Why camn't I private it.... ?????
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer Model: " + model + ", OS: " + osName);
        }

    }
}

