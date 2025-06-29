package staff;

public class MyHomework {
    public static void main(String[] args) {
getStaffInfo();
    }


    public static void getStaffInfo(){
        Director derector = new Director();
        System.out.println(derector.getPositionInfo());
        Worker worker= new Worker();
        System.out.println(worker.getPositionInfo());
        Accountant accountant= new Accountant();
        System.out.println(accountant.getPositionInfo());
    }
}
