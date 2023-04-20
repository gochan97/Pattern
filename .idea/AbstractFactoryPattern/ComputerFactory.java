public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractractFactory factory){
        return factory.createComputer();
    }
}
