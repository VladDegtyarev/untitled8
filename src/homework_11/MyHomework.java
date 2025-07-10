package homework_11;

public class MyHomework  {
    public static void main(String[] args) {
       getArr();
    }
    public static void getArr(){
        CustomArray<Object> customList = new CustomArray<>();
        customList.add(1);
        customList.add("Java");
        customList.add(367.12);
        customList.add("Vlad");
        customList.add(12345678890l);
        System.out.println("Elements:");
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("\t\t"+customList.get(i));
        }

    }
}

