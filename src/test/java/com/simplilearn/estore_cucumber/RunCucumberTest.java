package com.simplilearn.estore_cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("com.simplilearn.estore_cucumber")
//@SelectClasspathResource("com/simplilearn/estore_cucumber")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.simplilearn.estore_cucumber") // value needs to change from pretty to package name
public class RunCucumberTest {
}
