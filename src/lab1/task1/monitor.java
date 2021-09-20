package lab1.task1;

public class monitor { // first part lab 1

    public String color;
    public int screenSizeInInches;
    public String brand;


    private String resolution;
    // set to private cause I want to only be able to update it via setResolution & play with setters and stuff

    // function to set resolution
    public void setResolution(int resolutionWidth, int resolutionHeight){
        this.resolution = resolutionWidth + "x" + resolutionHeight;
    }

    // gets res
    public String getResolution(){
        return resolution;
    }

    // compares values
    public boolean compare(monitor m){

        return this.color.equals(m.color)
                && this.screenSizeInInches == m.screenSizeInInches
                && this.brand.equals(m.brand)
                && this.resolution.equals(m.resolution);
    }
}