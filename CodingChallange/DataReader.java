import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader{

    public static void main(String[] args){

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Premiere League Results: ");

        List<FootballScoreboard> soccerList = getFootballDetails("football.csv");
        for(FootballScoreboard scores : soccerList){
           
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println(scores);
            System.out.println("------------------------------------------------------------------------------------------------------------");
            scores.findSmallestGoalDifference(scores.getGoals(), scores.getGoalsAllowed());
        }   
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Weather data for a Month: ");

            List<WeatherData> weatherList = getWeatherDetails("weather.csv");
            for(WeatherData weather : weatherList){

                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(weather);
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                weather.findSmallestTemperatureDifference(weather.getMaxTemperature(), weather.getMinTemperature());
        }

    }


   private static List<FootballScoreboard> getFootballDetails(String file) {

        List<FootballScoreboard> soccerList = new ArrayList<>();
        Path pathToFile = Paths.get(file);
        try(BufferedReader br = Files.newBufferedReader(pathToFile)){
            String row = br.readLine();
            while(row != null){
                String[] elements = row.split(",");
                FootballScoreboard scores = getOneFootballScoreboard(elements);
                soccerList.add(scores);
                row = br.readLine(); 
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        

        return soccerList;
    }

    private static FootballScoreboard getOneFootballScoreboard(String[] elements) {
        String teams = elements[0];
        int games = Integer.parseInt(elements[1]);
        int wins = Integer.parseInt(elements[2]);
        int loses = Integer.parseInt(elements[3]);
        int draws = Integer.parseInt(elements[4]);
        int goals = Integer.parseInt(elements[5]);
        int goalsAllowed = Integer.parseInt(elements[6]);
        int points = Integer.parseInt(elements[7]);

        FootballScoreboard scores = new FootballScoreboard(teams, games, wins, loses, draws, goals, goalsAllowed, points);
        return scores;
    }
 

    private static List<WeatherData> getWeatherDetails(String file) {

        List<WeatherData> weatherList = new ArrayList<>();
        Path pathToFile = Paths.get(file);
        try(BufferedReader br2 = Files.newBufferedReader(pathToFile)){
            String row2 = br2.readLine();
            while(row2 != null){
                String[] elements = row2.split(",");
                WeatherData weather = getOneWeatherDetails(elements);
                weatherList.add(weather);
                row2 = br2.readLine(); 
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        

        return weatherList;
    }


private static WeatherData getOneWeatherDetails(String[] elements) {
    int day = Integer.parseInt(elements[0]);
    int maxTemperature = Integer.parseInt(elements[1]);
    int minTemperature = Integer.parseInt(elements[2]);
    Double avt = Double.parseDouble(elements[3]);
    Double avdp = Double.parseDouble(elements[4]);
    Double oneHrpTpcpn = Double.parseDouble(elements[5]);
    Double pdir = Double.parseDouble(elements[6]);
    Double avsp = Double.parseDouble(elements[7]);
    Double dir = Double.parseDouble(elements[8]);
    Double mxs = Double.parseDouble(elements[9]);
    Double skyc = Double.parseDouble(elements[10]);
    Double mxr = Double.parseDouble(elements[11]);
    Double mn = Double.parseDouble(elements[12]);
    Double rAvslp = Double.parseDouble(elements[13]);


WeatherData weather = new WeatherData(day,maxTemperature,minTemperature,avt,avdp,
oneHrpTpcpn,pdir,avsp,dir,mxs,skyc,mxr,mn,rAvslp);

    return weather;
}

}