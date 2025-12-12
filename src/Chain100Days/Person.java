package Chain100Days;

import java.util.Objects;

class Persons {
    private int id;
    private String name;

    public Persons(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Persons person = (Persons) o;

        return id == person.id && Objects.equals(name, person.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString(){
        return "Persons{" + id + ", " + name + "}";
    }
}
