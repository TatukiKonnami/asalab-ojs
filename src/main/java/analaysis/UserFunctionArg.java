package analaysis;

import java.util.List;

public class UserFunctionArg extends UserFunction{

    public  boolean setScore(List<String> codeList) {
        checkArgument(codeList);
        return true;
    }

    private boolean  checkArgument(List<String> codeList) {
        String defineRgx = "(.*\\(.*) + (.*\\*) + (.*\\))";
        //codeList.forEach(s -> System.out.println(s));
        setKind("UserFunctionArgumentUsePointer");
        setFilterCode(checkLine(defineRgx, codeList));
        return true;
    }


}
