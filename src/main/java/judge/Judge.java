package judge;

import analaysis.AnalysisInternalCode;
import analaysis.Category;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Judge {
    public static boolean complieCode(String path) {
        String[] command = {"clang", path, "-o", path + ".o"};
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            pb.start();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean execution(String path){
        String[] command = {"./" + path + ".o"};
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            pb.start();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean judgeCodeElement(String path){
        AnalysisInternalCode Code = new AnalysisInternalCode();
        List<Category> Categories = new ArrayList<Category>();
        try {
            Code.loadInterCode(path+".ll");
            Code.loadASTFile(path);
            Code.checkCategory();
            Code.getCategories().forEach(s -> System.out.println(s.getKind() + " : " + s.getScore()));
            Categories = Code.getCategories();
            judgeCategory(Categories);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean judgeCategory(List<Category> categories) {
        float score = 0;
        List<Integer> scoreList = new ArrayList<Integer>();
        int sum = 0;
        categories.forEach(i->scoreList.add(i.getScore()));
        sum = scoreList.stream()
                       .mapToInt(x -> x)
                       .sum();
        int n = categories.size();
        score = (float)sum / (float)n;
        System.out.println("score is " + score);
        if(score == 1){
            System.out.println("OK");
        }else {
            System.out.println("No");
        }
        return true;
    }

}