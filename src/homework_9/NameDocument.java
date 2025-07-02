package homework_9;

import java.io.Console;

public class NameDocument {
    private String name;

    public NameDocument(String name) {
        this.name = name;

    }
    public String nameG(){
        return name;
    }



    @Override
    public String toString() {
        return "Name document : " + name ;

    }


}
