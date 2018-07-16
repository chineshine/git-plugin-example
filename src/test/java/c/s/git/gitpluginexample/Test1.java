package c.s.git.gitpluginexample;

import org.junit.Test;

public class Test1 {

	@Test
	public void test1() {
		String reg = "^.*(?!-SNAPSHOT)$";
		String name = "0.0.1-SNAPSHOT";
		System.out.println(name.matches(reg));
	}
}
