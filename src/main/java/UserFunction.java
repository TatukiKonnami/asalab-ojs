import java.util.List;
import java.util.regex.Pattern;

public class UserFunction extends Category {


    public boolean setScore(List<String> codeList){
        checkDefine(codeList);
        return true;
    }

    private boolean checkDefine(List<String> codeList) {
        String defineRgx = "define";
        setKind("UserFunction");
        checkLine(defineRgx, codeList);
        return true;
    }
}
