package cse213.tutorialprojects.midterm2222181sec6;

public class Computer {
    private int serialNo;
    private String brand;
    private String model;
    private float price;
    private boolean gpu;
    private int noOfGPUCore;

    public Computer(int serialNo, String brand, String model, float price, boolean gpu, int noOfGPUCore) {
        this.serialNo = serialNo;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.gpu = gpu;
        this.noOfGPUCore = noOfGPUCore;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isGpu() {
        return gpu;
    }

    public void setGpu(boolean gpu) {
        this.gpu = gpu;
    }

    public int getNoOfGPUCore() {
        return noOfGPUCore;
    }

    public void setNoOfGPUCore(int noOfGPUCore) {
        this.noOfGPUCore = noOfGPUCore;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialNo=" + serialNo +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", gpu=" + gpu +
                ", noOfGPUCore=" + noOfGPUCore +
                '}';
    }

    public void updateWithVat() {
        float vat = 0.15;
        float vatAmount = this.price * vat;
        float total = this.price + vatAmount;
        this.setPrice(total);
    }
}
