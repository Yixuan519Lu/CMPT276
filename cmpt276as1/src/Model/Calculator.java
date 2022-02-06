package Model;

public class Calculator{
    private Lens mylens;
    private double distance;
    private double aperture;
    private static double circle_confusion = 0.029;

    public Calculator(Lens arg_lens, double arg_distance, double arg_aperture) {
        //copy consturctor
        this.distance = arg_distance;
        this.aperture = arg_aperture;
        this.mylens = arg_lens;
    }

    public double hyperfocal_distance() {
        return (mylens.getFocal_length()*mylens.getFocal_length())/(aperture*circle_confusion);
    }
    public double near_focal_point(){
        return (hyperfocal_distance()*(distance*1000))/(hyperfocal_distance()+((distance*1000)-mylens.getFocal_length()));
    }
    public double far_focal_point(){
        if(distance>hyperfocal_distance()){
            return Double.POSITIVE_INFINITY;
        }
        else{
            return (hyperfocal_distance()*(distance*1000))/(hyperfocal_distance()-((distance*1000)-mylens.getFocal_length()));
        }
    }
    public double depth_field(){
        return (far_focal_point()-near_focal_point());
    }
}
