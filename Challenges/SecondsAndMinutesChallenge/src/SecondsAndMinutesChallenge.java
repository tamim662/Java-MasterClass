// Clock Time Visualization
public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
//        String clockText = getDurationString(110,5);
        String clockText = getDurationString(36606);
        System.out.println(clockText);


    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>59){
            return "Invalid Value!";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        String stringHours = hours + "h ";
        String stringMinutes = remainingMinutes + "m ";
        String stringSeconds = seconds +"s ";
        if(hours<10){
            stringHours = "0" + stringHours;

        }
        if(remainingMinutes<10){
            stringMinutes  = "0" + stringMinutes;
        }
        if(seconds<10){
            stringSeconds = "0" + stringSeconds;
        }

        return stringHours+stringMinutes+stringSeconds;


    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid Value!";
        }
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        return getDurationString(minutes,remainingSeconds);

    }

}
