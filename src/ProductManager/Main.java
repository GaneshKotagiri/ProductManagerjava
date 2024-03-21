package ProductManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Service service=new Service();
        service.addEntities(new Entities("14 pro","Apple", 400, "Moderate","200mw"));

        service.addEntities(new Entities("A6 Galaxy", "Samsung", 400,"Moderate","200mw"));
        service.addEntities(new Entities("A6 Galaxy", "Samsung", 1200,"High","1600mw"));
        service.addEntities(new Entities("15 pro","Apple", 1200, "High","200mw"));
        service.addEntities(new Entities("14 pro","Apple", 400, "Moderate","200mw"));
        service.addEntities(new Entities("14 pro max","Apple", 1200, "High","1600mw"));
//        for (Entities entity:service.getEntities()){
//            System.out.println(entity);
//        }
        // To print the list of outputs in the same line we can use a for Each loop as above
        System.out.println(service.getEntityByName("14 pro"));
        System.out.println(service.getEntityByBrand("Apple"));
        System.out.println(service.getEntityByPrice(400));

    }
}