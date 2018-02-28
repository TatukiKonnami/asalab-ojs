package analaysis;

import java.util.List;

public class Varable extends Category {
    public boolean setScore(List<String> codeList){
        checkVarable(codeList);
        return true;
    }

    private boolean checkVarable(List<String> codeList) {
        String defineRgx = "(i32¥*|i8¥*|double¥*|float¥*|i64¥*)";
        setKind("Pointer");
        checkLine(defineRgx, codeList);
        return true;
    }
}
