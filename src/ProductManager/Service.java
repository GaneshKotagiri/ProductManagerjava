package ProductManager;

import ProductManager.Entities;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Service {
    //private List<ProductManager.Entities> EntityName=new ArrayList<>();
    private List<Entities> entities=new ArrayList<>();

    public List<Entities> getEntities() {
        return this.entities;
    }

    public void addEntities(Entities entity){
       this.entities.add(entity);
    }
    public List<Entities> getEntityByName(String entityName) {
        List<Entities> matchingName = new ArrayList<>();
        for (Entities entity : getEntities()) {
            if(entityName.equals(entity.getName())){
                matchingName.add(entity);
            }
        }
        return matchingName;
    }
    public List<Entities> getEntityByBrand(String BrandName){
        List<Entities> matchingBrandName=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(BrandName.equals(entity.getBrandName())){
                matchingBrandName.add(entity);
            }
        }return matchingBrandName;
    }
    public List<Entities> getEntityByPrice(Integer Price){
        List<Entities> matchingPrice=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(Price.equals(entity.getPrice())){
                matchingPrice.add(entity);
            }
        }return matchingPrice;
    }public List<Entities> getEntityByCamera(String CameraResolution){
        List<Entities> matchingCameraResolution=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(CameraResolution.equals(entity.getCameraResolution())){
                matchingCameraResolution.add(entity);
            }
        }return matchingCameraResolution;
    }public List<Entities> getEntityByBattery(String Battery){
        List<Entities> matchingBattery=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(Battery.equals(entity.getBattery())){
                matchingBattery.add(entity);
            }
        }return matchingBattery;
    }
}
