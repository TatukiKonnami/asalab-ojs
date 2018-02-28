
import analaysis.AnalysisInternalCode;
import codeCompile.ComplieCode;

import java.io.IOException;

class Main {
    public static void main(String[] args){
        AnalysisInternalCode Code = new AnalysisInternalCode();
        try {
            ComplieCode.chageInterCode(args[0]);
            ComplieCode.dumpAST(args[0]);
            Code.loadInterCode(args[0]+".ll");
            Code.loadASTFile(args[0]);
            Code.checkCategory();
            Code.getCategories().forEach(s -> System.out.println(s.getKind() + " : " + s.getScore()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
