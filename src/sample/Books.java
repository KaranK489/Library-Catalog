package sample;

public class Books {
    //declaring all variables.
    private String name;
    private String people = "";
    private boolean available = true;

    //function that creates a new object(Books) and sets its name.
    public Books(String n) {
        this.name = n;
    }

    //function that can get and return the object's name.
    public String getName() {
        return name;
    }

    //function that can add people's names to the object.
    public void addPeople(String n) {
        this.people = n;
    }

    //function that can remove people's names from the object.
    public void removePeople() {
        this.people = "";
    }

    //function that can get the name stored in the object.
    public String getPeople() {
        return this.people;
    }

    //function that can set the book's availability to true.
    public void bookAvailable() {
        this.available = true;
    }

    //function that can set the book's availability to false.
    public void bookUnavailable() {
        this.available = false;
    }

    //function that can get and return book's availability.
    public boolean getBookAvailability() {
        return this.available;
    }
}
