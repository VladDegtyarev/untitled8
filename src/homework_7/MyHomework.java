package homework_7;

public class MyHomework {
    public static void main(String[] args) {
        GetPhone();

    }
    public static void GetPhone(){
        Phone samsung_Vlad =  new Phone(26785094328l,"Galaxy",195.0);
        System.out.println(samsung_Vlad.getPhoneInformation());
        System.out.println(samsung_Vlad.receiveCall("Vlad"));
        System.out.println(samsung_Vlad.receiveCall("Vlad", samsung_Vlad.getNumber()));
        System.out.println("**********************************************");

        Phone sony_Nik =  new Phone(26785094328l,"Xperia 1",195.0);
        System.out.println(sony_Nik.getPhoneInformation());
        System.out.println(sony_Nik.receiveCall("Nik"));
        System.out.println(sony_Nik.receiveCall("Nik", sony_Nik.getNumber()));
        System.out.println("**********************************************");


        Phone huawei_Lisa =  new Phone(35454656757l,"Nova 14",171.5);
        System.out.println(huawei_Lisa.getPhoneInformation());
        System.out.println(huawei_Lisa.receiveCall("Lisa"));
        System.out.println(huawei_Lisa.receiveCall("Lisa", huawei_Lisa.getNumber()));
        System.out.println("**********************************************");
        System.out.println(huawei_Lisa.sendMessege(3435676, sony_Nik.getNumber(),
                3558734748l, samsung_Vlad.getNumber()));
        System.out.println("********************************************************");
    }
}
