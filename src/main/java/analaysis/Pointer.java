package analaysis;

import analaysis.Category;

import java.util.List;

public class Pointer extends Category {
    public boolean setScore(List<String> codeList){
        checkPointer(codeList);
        return true;
    }

    private boolean checkPointer(List<String> codeList) {
        String defineRgx = "\\*";
        setKind("analaysis.Pointer");
        checkLine(defineRgx, codeList);
        return true;
    }


}
