package homework_9;

import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {
        CreateDocument();
    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }
    public static void CreateDocument() {
        System.out.print("Please enter the name document :");
        try {
            NameDocument myDoc = new NameDocument(getInput().nextLine());
            if ( myDoc.nameG().startsWith("555")&&myDoc.nameG().contains("abc")&&myDoc.nameG().endsWith("1a2b")) {
                System.out.println("Document created! \n"+myDoc);
            } else {
            throw new SearchDoc("Invalid document name!") ;
            }
        }
            catch(SearchDoc e){
            System.out.println(e.getMessage());
        }
    }
}