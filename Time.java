public class Time {
    private int _hour;
    private int _minute;

    public Time(int hour, int minute){
        _hour=hour;
        _minute=minute;
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute(){
        return _minute;
    }

    public void setHour(int hour){
        _hour=hour;
    }

    public void setMinute(int minute){
        _minute=minute;
    }

    public String toString() {
        return(_hour+":"+_minute);
    }

    public static void main(String[] args) {
       
    }
}
