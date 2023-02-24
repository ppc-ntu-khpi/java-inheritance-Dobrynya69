package domain;


 /**
 * The class Horse extends ungulates
 */ 
public class Horse extends Ungulates{
    protected String coloring;
    

/** 
 *
 * Horse
 *
 * @param name  the name
 * @param weight  the weight
 * @param hasHorns  the has horns
 * @param coloring  the coloring
 */
    public Horse(String name, float weight, boolean hasHorns, String coloring){ 

        this.name = name;
        this.weight = weight;
        this.hasHorns = hasHorns;
        this.coloring = coloring;
    }
    

/** 
 *
 * Carries
 *
 */
    public void carries(){ 

        System.out.println("Horse is carries a man...");
    }
    
    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal:" + "\nName: " + name + "\nWeight: " + weight+" kg" + "\nHorns: " + hasHorns + "\nColoring: " + coloring;
    }
}
