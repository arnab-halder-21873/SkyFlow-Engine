package com.rocketman;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class MicroserviceWorkerB implements JavaDelegate{
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("ms2 entered...");
    }
}