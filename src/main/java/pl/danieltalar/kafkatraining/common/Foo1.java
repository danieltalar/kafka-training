package pl.danieltalar.kafkatraining.common;

public class Foo1 {

	private String foo;

	@Override
	public String toString() {
		return "Foo1{" +
				"foo='" + foo + '\'' +
				'}';
	}

	public Foo1() {
	}

	public Foo1(String foo) {
		this.foo = foo;
	}

	public String getFoo() {
		return this.foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
}
