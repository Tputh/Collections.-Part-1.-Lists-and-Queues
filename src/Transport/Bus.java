package Transport;



public class Bus extends Transport {


    public Bus(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);

    }

    @Override
    public String toString() {
        return "Марка " + getStamp() + "; " + "Модель " + getModel() + "; " + "Объём двигателя " + getEngineCapacity();
    }

    @Override
    public void passDiagnostics() {
        throw new RuntimeException("Автобусы не могут проходить диагностику");
    }

    @Override
    public void printЕhePilotCommand() {
        System.out.println("команда водителя");
    }








}
