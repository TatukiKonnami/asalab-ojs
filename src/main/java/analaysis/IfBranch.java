package analaysis;

import java.util.List;

public class IfBranch extends Category{
    public boolean setScore(List<String> astList){
        checkIfBranch(astList);
        return true;
    }

    private boolean checkIfBranch(List<String> astList) {
        String defineRgx = "IfStmt";
        setKind("If branch");
        checkLine(defineRgx, astList);
        return true;
    }
}
