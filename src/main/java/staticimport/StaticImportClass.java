package main.java.staticimport;

import static main.java.staticimport.StaticMethodClass.staticmethod;

public class StaticImportClass {

	void callStaticMethod() {

		staticmethod(); // It's possible to call the static method directly after doing a static import

	}

}
