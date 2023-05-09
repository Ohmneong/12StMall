package stmall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import stmall.StockApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { StockApplication.class })
public class CucumberSpingConfiguration {}
