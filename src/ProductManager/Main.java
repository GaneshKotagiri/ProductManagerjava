package ProductManager;

import java.io.FileOutputStream;

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
        Entities E = service.addEntities(new Entities("14 pro max","Apple", 1200, "High","1600mw"));
//        for (Entities entity:service.getEntities()){
//            System.out.println(entity);
//        }
        // To print the list of outputs in the same line we can use a for Each loop as above
        System.out.println(service.getEntityByName("14 pro"));
        System.out.println(service.getEntityByBrand("Apple"));
        System.out.println(service.getEntityByPrice(400));
        // Using streams we saved data in the file output.txt
        try{
            FileOutputStream output=new FileOutputStream("C:\\Users\\ganesh\\Desktop\\output.txt");
            //we are using the Entities type object in for each loop
            //service is the object for service class and getEntities is the method where we can retrieve all the entities
            // we cannot use byte array method for lists
            //we then write the data in entities to output and convert it using toString method and getBytes method
            for(Entities entities:service.getEntities()){
                output.write(entities.toString().getBytes());
                output.write(System.lineSeparator().getBytes());
            }

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}