package com.example.workflow.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessOddNumber implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Integer number = ((Double) delegateExecution.getVariable("number")).intValue();
        boolean isOddNumber = number%2!=0;
        System.out.println("isOddNumber : "+isOddNumber);
        delegateExecution.setVariable("isOddNumber",isOddNumber);
    }
}