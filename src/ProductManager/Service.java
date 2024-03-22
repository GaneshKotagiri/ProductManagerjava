package ProductManager;

import java.util.ArrayList;
import java.util.List;

public class Service {
    //private List<ProductManager.Entities> EntityName=new ArrayList<>();
    private List<Entities> entities=new ArrayList<>();

    public List<Entities> getEntities() {
        return this.entities;
    }
    //we are adding each entity here and storing in the list entities
    public Entities addEntities(Entities entity){
       this.entities.add(entity);
        return entity;
    }
    //this method is to get the entities with the same mobile name
    public List<Entities> getEntityByName(String entityName) {
        List<Entities> matchingName = new ArrayList<>();
        for (Entities entity : getEntities()) {
            if(entityName.equals(entity.getName())){
                matchingName.add(entity);
            }
        }
        return matchingName;
    }
    //this method is to get the entities with the same brand name
    public List<Entities> getEntityByBrand(String BrandName){
        List<Entities> matchingBrandName=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(BrandName.equals(entity.getBrandName())){
                matchingBrandName.add(entity);
            }
        }return matchingBrandName;
    }
    // this is the method to get entities with same price
    public List<Entities> getEntityByPrice(Integer Price){
        List<Entities> matchingPrice=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(Price.equals(entity.getPrice())){
                matchingPrice.add(entity);
            }
        }return matchingPrice;
    }
    //this method is to get the entities with the same camera resolution
    public List<Entities> getEntityByCamera(String CameraResolution){
        List<Entities> matchingCameraResolution=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(CameraResolution.equals(entity.getCameraResolution())){
                matchingCameraResolution.add(entity);
            }
        }return matchingCameraResolution;
    }
    //this is the method to get the entities with the same battery
    public List<Entities> getEntityByBattery(String Battery){
        List<Entities> matchingBattery=new ArrayList<>();
        for(Entities entity:getEntities()){
            if(Battery.equals(entity.getBattery())){
                matchingBattery.add(entity);
            }
        }return matchingBattery;
    }
}
