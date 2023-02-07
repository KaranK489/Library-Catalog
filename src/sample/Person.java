package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Person {
    //declaring all variables.
    private String name;
    private int cardNum;
    private String genre;
    private String age;

    //function that creates a new object(Person) and sets its name.
    public Person(String n) {
        this.name = n;
    }

    //function that can rename the object.
    public void setName(String n) {
        this.name = n;
    }

    //function that can get and return the object's name.
    public String getName() {
        return name;
    }

    //function that can set the library card number of the object to a random 6 digit number.
    public void setCardNum() {
        this.cardNum = (int) (Math.floor(Math.random() * (899999))) + 100000;
    }

    //function that can get and return the object's library card number.
    public String getCardNum() {
        return "'s library card number is " + cardNum;
    }

    //function that can set the preferred genre of the object.
    public void setGenre(String n) {
        this.genre = n;
    }

    //function that can get and return the genre of the object.
    public String getGenre() {
        return "'s genre preference is " + genre;
    }

    //function that can set the age of the object.
    public void setAge(String a) {
        this.age = a;
    }

    //function that can get and return the age of the object.
    public String getAge() {
        return "'s age is " + age;
    }
}
