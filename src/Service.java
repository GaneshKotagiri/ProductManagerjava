import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Entities> entities=new ArrayList<>();

    public List<Entities> getEntities() {
        return this.entities;
    }

    public void addEntities(Entities entity){
       this.entities.add(entity);
    }
}
