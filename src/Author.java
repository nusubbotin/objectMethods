public class Author {
    private String name;
    private String surname;

    Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString(){
      return "name = " + name + ", surname = " + surname;
    }
}
