package Model;

public class Lens{
    private String make;
    private double max_aperture;
    private int focal_length;

    //set function
    public void setMake(String arg){
        this.make=arg;
    }
    public void setAperture(double arg) {
        this.max_aperture=arg;
    }
    public void setFocal_length(int arg) {
        this.focal_length=arg;
    }

    //get function
    public String getMake(){
        return make;
    }
    public double getAperture() {
        return max_aperture;
    }
    public int getFocal_length() {
        return focal_length;
    }


    public Lens(){
        this.make="";
        this.max_aperture=0.0;
        this.focal_length=0;
    }
    public Lens(String make,double max_aperture,int focal_length){
        this.make=make;
        this.max_aperture=max_aperture;
        this.focal_length=focal_length;
    }


}