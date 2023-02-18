package domain;

public class Horse extends Ungulates{
    protected String coloring;
    
    public Horse(String name, float weight, boolean hasHorns, String coloring){
        this.name = name;
        this.weight = weight;
        this.hasHorns = hasHorns;
        this.coloring = coloring;
    }
    
    public void carries(){
        System.out.println("Horse is carries a man...");
    }
    
    @Override
    public String toString() {
        return "Animal:" + "\nName: " + name + "\nWeight: " + weight+" kg" + "\nHorns: " + hasHorns + "\nColoring: " + coloring;
    }
}
