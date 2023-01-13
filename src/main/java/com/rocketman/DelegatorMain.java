package com.rocketman;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class DelegatorMain implements JavaDelegate{
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("orchestrator entered...");
    }
}
