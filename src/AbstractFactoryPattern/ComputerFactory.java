package AbstractFactoryPattern;

public class ComputerFactory {
    public static Computer getComputer(PcFactory factory){
        return factory.createComputer();
    }
}
