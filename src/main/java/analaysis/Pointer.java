package analaysis;

import java.util.List;

public class Pointer extends Category {
    public boolean setScore(List<String> codeList){
        checkPointer(codeList);
        return true;
    }

    private boolean checkPointer(List<String> codeList) {
        String defineRgx = "\\*";
        setKind("Pointer");
        checkLine(defineRgx, codeList);
        return true;
    }
    


}
