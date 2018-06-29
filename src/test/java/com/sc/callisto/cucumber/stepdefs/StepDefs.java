package com.sc.callisto.cucumber.stepdefs;

import com.sc.callisto.CallistoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CallistoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
