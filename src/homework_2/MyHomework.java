package homework_2;

public class MyHomework{


    public static void main(String[]args){
getBasicInfo();
makeVariableExample();
            }

    public static void getBasicInfo(){
            String name="Vlad";
            String surname="Dgtyarev";
            int age=29;
            boolean isEmployed=true;
            System.out.println("Your name is "+name);
            System.out.println("Your surname is "+surname);
            System.out.println("Your age is "+age);
            System.out.print("Are your employed? "+isEmployed);
            }

    public static void makeVariableExample(){
            int a=5632;
            int b=329;
            int c=a/b+13;
            double q=(double)c+3.14;
            double x=34.986;
            int y=b-(int)x;
            double p=q+(double)y;
            double sum=q+x+p;
            System.out.println("сумма целых чисел "+a+b+c+y);
            System.out.println("сумма рациональных чисел "+sum);
            if((double)a>sum){
            System.out.println("true");
            }else{
            System.out.print("false");
            }

            }

            }
