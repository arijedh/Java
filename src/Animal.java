public class Animal {
    String family;
    String name;
    String city;
    int nbrCages;
    //final int nbrCages=25;

    //constructeur

    public Animal(String family,String name,String city,int nbrCages) {
        this.family = family;
        this.name = name;
        this.city = city;

        this.nbrCages = nbrCages;
    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", city=" + city+",nb cage :"+nbrCages + "]";
    }







}