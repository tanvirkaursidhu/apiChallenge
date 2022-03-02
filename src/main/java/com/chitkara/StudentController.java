package com.chitkara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private IStudentService studentService;

	@PostMapping(value = "/bfhl")
	public Student createStudentData(@RequestBody RequestJson requestJson) {
		return studentService.createStudentData(requestJson.getData());
	}
}
