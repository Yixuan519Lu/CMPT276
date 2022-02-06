package Model;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Manager implements  Iterable<Lens>{
    private List<Lens> mylens=new ArrayList<>();
    public void add(Lens temp) {
        this.mylens.add(temp);
    }
    public Lens getItemAt(int index) {
        return mylens.get(index);
    }
    public Iterator<Lens> iterator(){
        return mylens.iterator();
    }
}