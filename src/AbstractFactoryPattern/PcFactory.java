package AbstractFactoryPattern;

public class PcFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PcFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    public PcFactory() {
    }

    @Override
    public Computer createComputer() {
        return new Pc(ram,hdd,cpu);
    }

}
