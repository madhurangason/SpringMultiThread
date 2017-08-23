/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javasample.collabletask;



import java.util.concurrent.Callable;
 
public class CallableWorker implements Callable<String>{
 
    String name;
     
    public CallableWorker(String name) {
        this.name = name;
    }
     
    @Override
    public String call() throws Exception {
        process();
        String message = String.format("CallableWorker name: %s is Done", name);
        return message;
    }
     
    private void process(){ 
        for(int taskId=0; taskId < 10; taskId++){
            String message = String.format("CallableWorker name: %s is processing a taskId: %d", name, taskId);
            System.out.println(message);
        }
    }
     
}
