public class ReadOnly {

    private String name = "Kamil";

    public String getName() {          //Getter pobieranie wartości pola private
        return name;
    }

    public void setName(String name) {  //Setter ustawianie wartości pola private
        this.name = name;
    }
}
