import org.junit.Test;
import java.io.File;


import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AnalysisInternalCodeTest {

    AnalysisInternalCode code = new AnalysisInternalCode();
    String path = "src\\test\\resources\\e.c.ll";

    @Test
    public void loadInterCode() throws IOException {
        code.loadInterCode(path);
        assertThat("生成される配列のサイズが243行",code.getCodeList().size(), is(242));
        assertThat("配列の12行目は",code.getCodeList().get(11), is("  %3 = alloca i32, align 4\r"));
    }

    @Test
    public void checkUserFunction() throws IOException {
        code.loadInterCode(path);
        code.checkCategory();
        assertThat("ユーザ関数のcategoryができている", code.getCategories().get(0).getKind(), is("UserFunction"));
        assertThat("関数のスコアは1",code.getCategories().get(0).getScore(), is(1));
    }
}