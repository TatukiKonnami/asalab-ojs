
import analaysis.AnalysisInternalCode;
import codeCompile.ComplieCode;
import judge.Judge;

import java.io.IOException;

class Main {
    public static void main(String[] args){
        Judge judge = new Judge();
        ComplieCode.chageInterCode(args[0]);
        ComplieCode.dumpAST(args[0]);
        judge.judgeCodeElement(args[0]);
    }
}
