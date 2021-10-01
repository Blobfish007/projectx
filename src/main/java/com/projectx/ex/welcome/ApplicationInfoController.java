package com.projectx.ex.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.ex.ApplicationConfig;

@CrossOrigin
@RestController
public class ApplicationInfoController {

	private final ApplicationConfig applicationConfig;

	@Autowired
	public ApplicationInfoController(ApplicationConfig applicationConfig) {
		this.applicationConfig = applicationConfig;
	};

	@GetMapping(value="info")
	public ApplicationInfo getAppInfo() {
		return new ApplicationInfo(this.applicationConfig.getName(), this.applicationConfig.getVersion());
	}

}
