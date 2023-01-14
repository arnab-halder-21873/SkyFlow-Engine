package com.rocketman;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class MicroserviceWorkerA implements JavaDelegate{
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("ms1 entered...");
    }
}