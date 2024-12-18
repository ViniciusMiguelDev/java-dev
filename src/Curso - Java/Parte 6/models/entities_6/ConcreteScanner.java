public class ConcreteScanner extends Device implements Scanner{
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    public String scan() {
        return "Scanned content";
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }
    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
