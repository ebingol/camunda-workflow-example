package com.example.workflow.delegate;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.workflow.service.LeaveService;

@Named(value = "initiateLeaveDelegate")
public class InitiateLeaveDelegate implements JavaDelegate {

	@Autowired
	LeaveService leaveService;
	
	/**
	 * delegationExpression in flow
	 */
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("I am in class: " + InitiateLeaveDelegate.class);
		//to add assignee variable to the process
		execution.setVariable("userAsignee", "manager");
		leaveService.initLeave();

	}

}
