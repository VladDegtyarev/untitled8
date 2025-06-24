package homework_7;

public class Phone {
    private long number;
    private String model;
    private double weight;



    public Phone() {}
    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight=weight;
        Phone phone = new Phone(1232456, "C14");

    }

    public String getPhoneInformation () {
            return "Number phone : " + number + "\n" +
                    "Model Phone : " + model + "\n" +
                    "Wight phone :  " + weight;
        }
        public long getNumber () {
            return number;
        }
        public long receiveCall (String name){
            System.out.println(name + "  is calling you");
            return number;
        }

        public String receiveCall (String name ,long number){
            System.out.print(name + " " + number + " is calling you");
            return "";
        }

        public String sendMessege ( long...number){
            System.out.println("Massages sent : ");
            for (long index = 0; index < number.length; index++) {
                long value = number[(int) index];
                System.out.println(value);
            }return "";
        }
    }
