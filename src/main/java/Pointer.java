import java.util.List;

public class Pointer extends Category {
    public boolean setScore(List<String> codeList){
        checkPointer(codeList);
        return true;
    }

    private boolean checkPointer(List<String> codeList) {
        String defineRgx = "(|i32|i8|double|void|float|i64|)+(/*)";
        setKind("Pointer");
        checkLine(defineRgx, codeList);
        return true;
    }


}
