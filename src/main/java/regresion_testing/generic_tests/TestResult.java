package regresion_testing.generic_tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestResult {
	private String url;
	private boolean success;
	private String errorMessage = "No error apparently";
	private String testName;
	private Map<String, String> args;

	public TestResult(String url, String testName, Map<String, String> args) {
		super();
		this.url = url;
		this.testName = testName;
		this.args = args;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getUrl() {
		return url;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getTestName() {
		return testName;
	}

	public String getArgKey() {
		List<String> keySet = new ArrayList<String>(args.keySet());
		return keySet.get(0);
	}

	public String getArgValue() {
		List<String> keySet = new ArrayList<String>(args.keySet());
		return args.get(keySet.get(0));
	}

	@Override
	public int hashCode() {
		return Objects.hash(args, errorMessage, success, testName, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestResult other = (TestResult) obj;
		return Objects.equals(args, other.args)
				&& Objects.equals(errorMessage, other.errorMessage)
				&& success == other.success
				&& Objects.equals(testName, other.testName)
				&& Objects.equals(url, other.url);
	}

	@Override
	public String toString() {

		return " | testName=" + testName + " | url=" + url + " | input="
				+ getArgValue() + " | XPath=" + getArgKey() + " | errorMessage="
				+ errorMessage;
	}
}
