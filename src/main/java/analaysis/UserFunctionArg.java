package analaysis;

import javafx.collections.transformation.FilteredList;

import java.util.List;

public class UserFunctionArg extends UserFunction{

    public  boolean setScore(List<String> codeList) {
        checkArgument(codeList);
        return true;
    }

    private boolean  checkArgument(List<String> codeList) {
        String defineRgx = "(.*\\()+(.*\\*)+(\\))";
        setKind("UserFunctionArgumentUsePointer");
        setFilterCode(checkLine(defineRgx, codeList));
        //getFilterCode().forEach(s -> System.out.println(s));
        return true;
    }


}
