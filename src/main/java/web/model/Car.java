package web.model;

public class Car {
    private String model;
    private String color;
    private int modelIndex;

    public Car() {
    }

    public Car(String model, String color, int modelIndex) {
        this.model = model;
        this.color = color;
        this.modelIndex = modelIndex;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelIndex() {
        return modelIndex;
    }

    public void setModelIndex(int modelIndex) {
        this.modelIndex = modelIndex;
    }

    @Override
    public String toString() {
        return model +
                ", color: " + color +
                ", model index: " + modelIndex;
    }
}

