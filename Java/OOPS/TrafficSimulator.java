enum Signal{
    RED,YELLOW,GREEN
}
class TrafficLight{
    Signal current;
    public TrafficLight(){
        current=Signal.RED;
    }
    void change(){
        switch (current){
            case RED:
                current=Signal.GREEN;
                break;
            case GREEN:
                current=Signal.YELLOW;
                break;
            case YELLOW:
                current=Signal.RED;
                break;
        }
    }
    void display(){
        switch (current){
            case RED:

                System.out.println("[]RED-STOP");
                break;
            case  GREEN:
                System.out.println("[]GREEN-GO");
                break;
            case YELLOW:
                System.out.println("[]YELLOW-READY");
                break;
        }
    }
}
public class TrafficSimulator {
    public static void main(String[] args) throws InterruptedException{
        TrafficLight light=new TrafficLight();

        for (int i=0;i<6;i++){
            light.display();
            Thread.sleep(3000);
            light.change();
        }
        System.out.println("Simulation ended");
    }
}
