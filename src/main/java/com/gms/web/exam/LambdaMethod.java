package com.gms.web.exam;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaMethod {
	public static void main(String[] args) {
		Function<String, Integer> f = Integer::parseInt;
		int a = f.apply("5");
		System.out.println(a);
		Consumer<String> c = System.out::println;
		c.accept("Hello Lambda");
	}
}
