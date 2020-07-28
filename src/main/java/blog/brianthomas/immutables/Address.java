package blog.brianthomas.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Address {
	public abstract int number();
	public abstract String street();
	public abstract String city();
	public abstract String state();
	public abstract String zip();
}
