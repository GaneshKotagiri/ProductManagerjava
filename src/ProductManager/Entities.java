package ProductManager;

public class Entities {
    private String Name;
    private String BrandName;
    private int Price;
    private String CameraResolution;
    private String Battery;

    public Entities(String name, String brandName, int price, String cameraResolution, String battery) {
        Name = name;
        BrandName = brandName;
        Price = price;
        CameraResolution = cameraResolution;
        Battery = battery;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getCameraResolution() {
        return CameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        CameraResolution = cameraResolution;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }
    @Override
    public String toString() {
        return "ProductManager.Entities{" +
                "Name='" + Name + '\'' +
                ", BrandName='" + BrandName + '\'' +
                ", Price=" + Price +
                ", CameraResolution='" + CameraResolution + '\'' +
                ", Battery='" + Battery + '\'' +
                '}';
    }
}
