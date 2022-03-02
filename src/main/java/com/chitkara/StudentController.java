package com.chitkara;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private IStudentService studentService;

	@GetMapping(value = "/student")
	public Student getStudentData() {
		List<String> input = new ArrayList<String>();
		input.add("A");
		input.add("D");
		input.add("1");
		input.add("6");
		input.add("7");
		return studentService.createStudentData(input);
	}

	@PostMapping(value = "/student")
	public Student createStudentData(@RequestBody RequestJson requestJson) {
		return studentService.createStudentData(requestJson.getData());
	}
}
