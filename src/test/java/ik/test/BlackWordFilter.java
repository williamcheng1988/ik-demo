package ik.test;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.model.analyzer.Lexeme;

public class BlackWordFilter {
	public void print(String str) {
		try {
			IKSegmenter ik = new IKSegmenter(new StringReader(str), true);
			Lexeme l = null;
			while ((l = ik.next()) != null) {
				if (l.getProps().equals("bad"))
					System.out.println(l.getLexemeText() + ":" + l.getProps());
				if (l.getProps().equals("bad2"))
					System.out.println(l.getLexemeText() + ":" + l.getProps());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test1() throws IOException {
		String str = "向卧槽sdf傻叉";
		print(str);
	}
}
