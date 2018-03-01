
import analaysis.AnalysisInternalCode;
import codeCompile.ComplieCode;
import judge.Judge;

import java.io.IOException;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Judge judge = new Judge();
        ComplieCode.chageInterCode(args[0]);
        ComplieCode.dumpAST(args[0]);
        Thread.sleep(1);
        judge.judgeCodeElement(args[0]);
    }
}
