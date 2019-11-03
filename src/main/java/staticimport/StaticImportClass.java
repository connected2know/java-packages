package main.java.staticimport;

import static main.java.staticimport.StaticMethodClass.staticmethod;

public class StaticImportClass {

	void getStudentName() {

		staticmethod(); // It's possible to call the static method directly after doing a static import

	}

}
