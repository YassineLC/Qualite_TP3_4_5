package com.example.demo.data;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ VoitureTest.class, EchantillonTest.class })
public class TestSuite {
}
