package UI;
import Model.Calculator;
import Model.Lens;
import Model.Manager;


import java.text.DecimalFormat;
import java.util.Scanner;

public class myUI{
    private static final double COC = 0.029;    // "Circle of Confusion" for a "Full Frame" camera
    private Manager manager;
    private Scanner in = new Scanner(System.in);// Read from keyboard



    public myUI(Manager arg){
        // Accept and store a reference to the lens manager (the model)
        // (this design is called "dependency injection")
        this.manager = arg;
        // Populate lenses (Make, max aperture (smallest supported F number), focal length [mm]):
        manager.add(new Lens("Canon", 1.8, 50));
        manager.add(new Lens("Tamron", 2.8, 90));
        manager.add(new Lens("Sigma", 2.8, 200));
        manager.add(new Lens("Nikon", 4, 200));
        manager.add(new Lens("ElCheepo", 12, 24));
        manager.add(new Lens("Leica", 5.6, 1600));
        manager.add(new Lens("TheWide", 1.0, 16));
        manager.add(new Lens("IWish", 1.0, 200));
    }

    public void show() {
        while(true){
            int num_lens=8;
            System.out.println("Choose a lens: \n");
            for(int i=0;i<num_lens;i++){
                System.out.println(i+". "+manager.getItemAt(i).getMake()+" "+manager.getItemAt(i).getFocal_length()+"mm F"+manager.getItemAt(i).getAperture());
            }
            System.out.println("(-1 to exit): \n");
            int index=in.nextInt();
            if(index==-1){
                System.out.println("Successfully exit");
                break;
            }
            else if(index<0||index>num_lens){
                System.out.println("Invalid iput");
            }
            else{
                Lens mylens=manager.getItemAt(index);
                System.out.print("Enter aperture, F number [1.8 - 22]:");
                double myAperture=in.nextDouble();
                if(myAperture<manager.getItemAt(index).getAperture()){
                    System.out.println("Invalid aperture");
                }
                else if(myAperture<1.8||myAperture>22){
                    System.out.println("Invalid aperture");
                }
                else{
                    System.out.print("Enter distance(in m) [0 to more]:");
                    double myDistance=in.nextDouble();
                    if(myDistance<0.0){
                        System.out.println("Invalid distance");
                    }
                    Calculator myCal=new Calculator(mylens,myDistance,myAperture);
                    System.out.println("In focus:"+formatM(myCal.near_focal_point()/1000)+
                            "m to "+formatM(myCal.far_focal_point()/1000)+
                            "m [DoF = "+formatM(myCal.depth_field()/1000)+"m]");
                    System.out.println("Hyperfocal point:"+formatM(myCal.hyperfocal_distance()/1000)+"m");
                }
            }
        }
    }

    private String formatM(double distanceInM) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(distanceInM);
    }



}