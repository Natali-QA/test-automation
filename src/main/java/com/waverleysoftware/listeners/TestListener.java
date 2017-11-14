package com.waverleysoftware.listeners;

import lombok.extern.slf4j.Slf4j;
import org.testng.*;

import java.time.LocalDate;

@Slf4j
@SuppressWarnings("JavadocType")
public class TestListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(final IInvokedMethod method, final ITestResult testResult) {
        if (method.isTestMethod()) {
            log.info("Method name: {} ", method.getTestMethod().getMethodName());
        }
    }

    @Override
    public void afterInvocation(final IInvokedMethod method, final ITestResult testResult) {
        if (method.isTestMethod() && testResult.getStatus() == ITestResult.FAILURE) {
            takeScreenshot();
        }
    }

    public void takeScreenshot() {
        String.format("Taking screenshot  %s - %s", "data1", LocalDate.now());
        log.info("Taking screenshot {} - {}", "data", LocalDate.now());
    }
}
