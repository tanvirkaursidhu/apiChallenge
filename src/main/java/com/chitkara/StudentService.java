package com.chitkara;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
	@Override
	public Student createStudentData(List<String> data) {
		List<String> numbers = new ArrayList<String>();
		List<String> alphabets = new ArrayList<String>();

		for (String input : data) {
			try {
				Integer.parseInt(input);
				numbers.add(input);
			} catch (NumberFormatException nfe) {
				alphabets.add(input);
			}
		}
		return new Student(true, "tanvir_kaur_25092001", "tanvir0887.cse19@chitkara.edu.in", "1910990887", numbers, alphabets);
	}
}
