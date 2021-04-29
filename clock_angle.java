import java.util.Scanner;
class clock_angle{
    public double findAngle(Integer hr,Integer min){
        if(hr<0 || min<0){
            System.out.println("Wrong input");
        }
        if(hr==12){
            hr=0;
        }
        if(min==60){
            min=0;
            hr+=1;
        }
        double hour_angle = (0.5*(hr*60+min));
        double minute_angle = (6*min);
        double clock_angle = Math.abs(hour_angle-minute_angle);
        clock_angle = Math.min(360-clock_angle,clock_angle);
        return clock_angle;
    }

public static void main(String[] args){
    Scanner reader1 = new Scanner(System.in);
    try{
        System.out.print("hour =  ");
        int h = reader1.nextInt();
        System.out.print("min =  ");
        int m = reader1.nextInt();
        clock_angle c = new clock_angle();
        double angle = c.findAngle(h,m);
        System.out.println(angle+" degrees");
    }
    finally{
        reader1.close();
    }
}
}