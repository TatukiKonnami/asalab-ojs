package analaysis;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Category {
    private String Kind;
    private int Score = 0;
    private List<String> FilterCode = new ArrayList<String>();

    public List<String> getFilterCode() {
        return FilterCode;
    }

    public void setFilterCode(List<String> filterCode) {
        FilterCode = filterCode;
    }

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


    public List<String> checkLine(String reg, List<String> codeLine){
        Pattern pattern = Pattern.compile(reg);
        setFilterCode(codeLine.stream()
                              .filter(o ->  pattern.matcher(o).find())
                              .collect(Collectors.toList()));
        if (FilterCode.size() != 0 ){
            setScore(1);
        }
        return FilterCode;
    }


}
