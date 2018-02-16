import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Category {
    private String Kind;
    private int Score = 0;



    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public boolean checkLine(String reg, List<String> codeLine){
        int findCount = 0;
        Pattern pattern = Pattern.compile(reg);
        for (String line : codeLine){
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()){
                findCount++;
                Score++;
            }
        }
        Score = Score / findCount;
        return true;
    }
}
