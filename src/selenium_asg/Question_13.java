package selenium_asg;
import org.testng.annotations.Test;

public class Question_13 {
	@Test(groups = { "red" })
	public void red1() {
		System.out.println("This is red 1");
	}

	@Test(groups = { "red" })
	public void red12() {
		System.out.println("This is red 2");
	}

	@Test(groups = { "red" })
	public void red3() {
		System.out.println("This is red 3");
	}

	@Test(groups = { "green" })
	public void green1() {
		System.out.println("This is green 1");
	}

	@Test(groups = { "green" })
	public void green2() {
		System.out.println("This is green 2");
	}

	@Test(groups = { "green" })
	public void green3() {
		System.out.println("This is green 3");
	}

	@Test(groups = { "green", "red" })
	public void green_red() {
		System.out.println("This is green_red ");
	}

}
