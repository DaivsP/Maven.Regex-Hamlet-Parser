import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;
    private final Pattern Hamlet = Pattern.compile("Hamlet");
    private final Pattern Horatio = Pattern.compile("Horatio");
    private final Pattern HAMLET = Pattern.compile("HAMLET");
    private final Pattern HORATIO = Pattern.compile("HORATIO");
    private final String Leon = "Leon";
    private final String Tariq = "Tariq";
    private final String LEON = "LEON";
    private final String TARIQ = "TARIQ";
    private Matcher matcher;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }


    public String changeHAMLETToLEON(String input) {
        matcher = HAMLET.matcher(input);
        input = matcher.replaceAll(LEON);
        return input;
    }

    public String changeHamletToLeon(String input){
        matcher = Hamlet.matcher(input);
        input = matcher.replaceAll(Leon);
        return input;
    }

    public String changeHoratioToTariq(String input) {
        matcher = Horatio.matcher(input);
        input = matcher.replaceAll(Tariq);
        return input;
    }

    public String changeHORATIOToTARIQ(String input){
        matcher = HORATIO.matcher(input);
        input = matcher.replaceAll(TARIQ);
        return input;
    }

    public boolean findHoratio(String input) {
        return Horatio.matcher(input).find();
    }

    public boolean findHamlet(String input) {
        return Hamlet.matcher(input).find();
    }

    public boolean findHORATIO(String input){
        return HORATIO.matcher(input).find();
    }

    public boolean findHAMLET(String input){
        return HAMLET.matcher(input).find();
    }

    public void execute() {
        String answer;
        answer = changeHAMLETToLEON(hamletData);
        answer = changeHamletToLeon(answer);
        answer = changeHORATIOToTARIQ(answer);
        answer = changeHoratioToTariq(answer);
        System.out.println(answer);
    }
}
