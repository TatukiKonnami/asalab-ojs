package analaysis;

import java.util.List;

public class SwitchCaseBranch extends Category{
    public boolean setScore(List<String> codeList){
        chackSwhichCase(codeList);
        return true;
    }

    private boolean chackSwhichCase(List<String> codeList){
        String defineRgx = "switch";
        setKind("switch case branch");
        setFilterCode(checkLine(defineRgx, codeList));
        return true;
    }
}
