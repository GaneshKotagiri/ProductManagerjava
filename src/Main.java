//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Service service=new Service();
        service.addEntities(new Entities("14 pro","Apple", 1200, "High","200mw"));
        for (Entities entity:service.getEntities()){
            System.out.println(entity);
        }
    }
}