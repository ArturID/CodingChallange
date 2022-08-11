
public class WeatherData {
    
    private int day;
    private int maxTemperature;
    private int minTemperature;
    private Double avt;
    private Double avdp;
    private Double oneHrpTpcpn;
    private Double pdir;
    private Double avsp;
    private Double dir;
    private Double mxs;
    private Double skyc;
    private Double mxr;
    private Double mn;
    private Double rAvslp;


    public WeatherData(int day, int maxTemperature, int minTemperature, Double avt, Double avdp, Double oneHrpTpcpn, Double pdir,Double avsp, Double dir , Double mxs, Double skyc, Double mxr, Double mn, Double rAvslp){

        this.day = day;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.avt = avt;
        this.avdp = avdp;
        this.oneHrpTpcpn = oneHrpTpcpn;
        this.pdir = pdir;
        this.avsp = avsp;
        this.dir = dir;
        this.mxs = mxs;
        this.skyc = skyc;
        this.mxr = mxr;
        this.mn = mn;
        this.rAvslp = rAvslp;
    }

    public WeatherData(){

    }

    @Override
    public String toString(){
        return "[Day: " + day + "| MaxTemperature: " + maxTemperature + "| MinTemperature: " + minTemperature + "| Avt: " 
        + avt + "| Avdp: " + avdp + "| 1Hrp Tpcpn: " + oneHrpTpcpn + "| Pdir: " + pdir + "| Avsp: "
         + avsp + "| Dir: " + dir + "| Mxs: " + mxs + "| Skyc: " + skyc + "| Mxr: " + mxr + "| mn: " + mn + "| R Avslp: " + rAvslp;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
 
    public int getMinTemperature() {
        return minTemperature;
    }
  
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Double getAvt() {
        return avt;
    }

    public void setAvt(Double avt) {
        this.avt = avt;
    }

    public Double getAvdp() {
        return avdp;
    }
    
    public void setAvdp(Double avdp) {
        this.avdp = avdp;
    }

    public Double getOneHrpTpcpn() {
        return oneHrpTpcpn;
    }

    public void setOneHrpTpcpn(Double oneHrpTpcpn) {
        this.oneHrpTpcpn = oneHrpTpcpn;
    }

    public Double getPdir() {
        return pdir;
    }

    public void setPdir(Double pdir) {
        this.pdir = pdir;
    }

    public Double getAvsp() {
        return avsp;
    }

    public void setAvsp(Double avsp) {
        this.avsp = avsp;
    }

    public Double getDir() {
        return dir;
    }

    public void setDir(Double dir) {
        this.dir = dir;
    }

    public Double getMxs() {
        return mxs;
    }

    public void setMxs(Double mxs) {
        this.mxs = mxs;
    }

    public Double getSkyc() {
        return skyc;
    }

    public void setSkyc(Double skyc) {
        this.skyc = skyc;
    }

    public Double getMxr() {
        return mxr;
    }

    public void setMxr(Double mxr) {
        this.mxr = mxr;
    }

    public Double getMn() {
        return mn;
    }

    public void setMn(Double mn) {
        this.mn = mn;
    }

    public Double getRAvslp() {
        return rAvslp;
    }

    public void setRAvslp(Double rAvslp) {
        this.rAvslp = rAvslp;
    }

    public void findSmallestTemperatureDifference(int maxTemperature, int minTemperature){
        int i = 0;
        while(i < 5){
            if(i == maxTemperature - minTemperature){
                System.out.println("Der Tag: " + day + " hatte den geringsten Temperaturunterschied, er beträgt:" + (maxTemperature - minTemperature) + "°C");
                break;
            }i++;
            }    
        }
}
