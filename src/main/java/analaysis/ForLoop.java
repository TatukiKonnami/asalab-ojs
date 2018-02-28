package analaysis;

import java.util.List;

public class ForLoop extends Category{
    public boolean setScore(List<String> astList){
        checkForLoop(astList);
        return true;
    }

    private boolean checkForLoop(List<String> astList){
        String defineRgx = "ForStmt";
        setKind("For Loop");
        checkLine(defineRgx, astList);
        return true;
    }
}
