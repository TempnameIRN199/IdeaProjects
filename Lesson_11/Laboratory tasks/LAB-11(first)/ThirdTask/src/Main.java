import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.Map;

public class Main
{
	public static void main(String[] args)
	{
		String[] sentences = new String[]
		{
		    "The quick brown fox jumps over the lazy dog.",
		    "Java is a versatile programming language used worldwide.",
		    "Learning to code is both challenging and rewarding.",
		    "The sun rises in the east and sets in the west.",
			"Artificial intelligence is shaping the future of technology.",
		    "She sells seashells by the seashore.",
		    "A journey of a thousand miles begins with a single step.",
		    "Practice makes perfect, so keep improving every day.",
			"Reading books expands your knowledge and imagination.",
			"Teamwork is the key to achieving great success."
		};
		
	    Map<String, Long> specMap = Stream.of(sentences)
	    	.flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
	        .map(String::toLowerCase)
	        .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
	    
	    specMap.forEach((key, val) -> System.out.println(key + " - " + val));
	}
}
