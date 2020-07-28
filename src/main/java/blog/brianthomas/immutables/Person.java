package blog.brianthomas.immutables;

import java.util.Date;
import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Person {
	public abstract String name();
	public abstract Date birthdate();
	public abstract List<String> phoneNumbers();
	public abstract Address address();
}
