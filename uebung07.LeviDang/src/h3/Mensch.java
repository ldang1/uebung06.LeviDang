package h3;

public class Mensch {

    public String name;
    public int gebJahr;
    public int alter;

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public void setAlter() {
        int aktuellesJahr = 2025;
        this.alter = aktuellesJahr - this.gebJahr;
    }

    public String getName() {
        return name;
    }

    public int getGebJahr() {
        return gebJahr;
    }

    public int getAlter() {
        return alter;
    }
}

