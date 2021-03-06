package ik.test;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.model.analyzer.Lexeme;

public class CommonTest {
	public void print(String str) {
		try {
			//true为最大分词  false完全匹配
			IKSegmenter ik = new IKSegmenter(new StringReader(str), false);
			Lexeme l = null;
			while ((l = ik.next()) != null) {
				System.out.println(l.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test1() throws IOException {
		String str = "我是中国人";
		print(str);
	}
}
