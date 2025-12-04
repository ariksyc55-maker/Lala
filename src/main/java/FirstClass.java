public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Система расчета штрафов");
        int carSpeed = 130;
        System.out.println(carSpeed);
        int fineFor20to40 = 500;
        int fineFor40to60 = 1000;
        int fineFor60to80 = 2000;
        int fineFor80andmore = 5000;
        int townSpeed = 60;
        int overSpeed = carSpeed - townSpeed;
        if(overSpeed < 20);{
            System.out.println("Скорость не превышена или превышена не значительно");
        }
        if(overSpeed >= 20 && overSpeed < 40);{
            System.out.println("Штраф: " + fineFor20to40);
        }
    }
}
