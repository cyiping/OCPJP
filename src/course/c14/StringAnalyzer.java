package course.c14;

@FunctionalInterface
public interface StringAnalyzer {
	public boolean analyze(String target, String keyStr);
}