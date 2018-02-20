package analaysis;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnalysisInternalCode {
    private List<String> CodeList = new ArrayList<String>();
    private List<Category> Categories = new ArrayList<Category>();

    public boolean loadInterCode(String path) throws  IOException{
        String a = Files.lines(Paths.get(path), Charset.forName("UTF-8"))
                .collect(Collectors.joining(System.getProperty("line.separator")));
        CodeList = Arrays.asList(a.split("\\n", 0));
        return true;
    }

    public List<Category> getCategories() {
        return Categories;
    }

    public List<String> getCodeList() {
        return CodeList;
    }

    public boolean checkCategory(){
        checkUserFunction();
        checkPointer();
        return true;
    }

    private boolean checkPointer() {
        Pointer pointer = new Pointer();
        pointer.setScore(CodeList);
        Categories.add(pointer);
        return true;
    }

    private boolean checkUserFunction() {
        UserFunction userFunction = new UserFunction();
        userFunction.setScore(CodeList);
        Categories.add(userFunction);
        return true;
    }


}
