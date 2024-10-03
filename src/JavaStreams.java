import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams {
		
		@Test
		public void general()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Arockia");
			names.add("Prici");
			names.add("Anjali");
			names.add("Potty");
			
			int count=0;
			for(int i=0;i<names.size();i++)
				
			{
				
				String name = names.get(i);
				if(name.startsWith("A"))
				{
					count++;
				}
		}
			
			System.out.println(count);

	}
		@Test
		public void JavaStreams()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Arockia");
			names.add("Prici");
			names.add("Anjali");
			names.add("Potty");
			
//			There is no life for intermediate operation(filter) if there is no terminal operation(count)
//			The terminal operation(count) will not execute if intermediate operation(filter) returns false
//			we can create inputs using streams
			
			long count = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(count);
			
//			creating inputs in single line
			Stream.of("Arockia", "Prici", "Anjali", "Potty");
			
//			Creating list with names greater than length of 4 and printing it
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			
//			To limit the number of results
			names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
			
//			To print the names ending with a and convert those to uppercase
			names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
//			To print the names starting with A and sort
			names.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
			
//			To concatenate 2 lists
			Stream<String> name1 = Stream.of("Milira", "Dielle", "Lenny", "Penny");
			Stream<String> newStream = Stream.concat(names.stream(), name1);
			newStream.forEach(s->System.out.println(s));
			
//			To check whether particular string is present in the concatenated list or not
			boolean flag = names.stream().anyMatch(s->s.equalsIgnoreCase("Prici")); // match function returns the boolean value
			Assert.assertTrue(flag);
			
//			Collecting the output to list
			List<String> list = names.stream().filter(s->s.length()>4).collect(Collectors.toList());
			System.out.println(list.get(0));
			
//			Print unique numbers in the list
			List<Integer> values = Arrays.asList(2,2,3,1,7,34,56,22,1,4,9,65);
//			values.stream().distinct().forEach(s->System.out.println(s));
			values.stream().distinct().sorted().forEach(s->System.out.println(s));
		}

}
