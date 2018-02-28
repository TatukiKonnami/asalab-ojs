package analaysis;

import java.util.List;

public class UserFunction extends Category {


    public boolean setScore(List<String> codeList){
        checkDefine(codeList);
        return true;
    }

    private boolean checkDefine(List<String> codeList) {
        String defineRgx = "define";
        setKind("UserFunction");
        setFilterCode(checkLine(defineRgx, codeList));
        return true;
    }

}
