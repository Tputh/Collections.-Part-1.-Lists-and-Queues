package Transport;

import java.util.ArrayList;

public abstract class Transport {

    private String stamp;
    private String model;
    private double engineCapacity;
    private final ArrayList<Mechanics> mechanics = new ArrayList<>();


    public String getStamp() {
        return stamp;
    }
    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public ArrayList<Mechanics> getMechanics() {
        return mechanics;
    }
    public void addMechanica(Mechanics mechanics) {
        getMechanics().add(mechanics);
        System.out.println("Механик " + mechanics.getName() + " Из компании " + mechanics.getCompany() +
                " Транспорт обслуживания " + mechanics.getTransportType());
    }


    public Transport(String stamp, String model, double engineCapacity) {
        this.stamp = stamp;
        this.model = model;
        this.engineCapacity = engineCapacity;

    }
    public abstract void passDiagnostics();
    public abstract void printЕhePilotCommand();






}
