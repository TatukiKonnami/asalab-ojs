package analaysis;

import java.util.List;

public class WhileLoop extends Category{
    public boolean setScore(List<String> astList){
        checkWhileLoop(astList);
        return true;
    }

    private boolean checkWhileLoop(List<String> astList) {
        String defineRgx = "WhileStmt";
        //astList.forEach(i -> System.out.println(i));
        setKind("while loop");
        checkLine(defineRgx, astList);
        return true;
    }

}
