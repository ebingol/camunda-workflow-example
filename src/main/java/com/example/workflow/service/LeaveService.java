package com.example.workflow.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author ezgi-lab
 *
 * called as expression in the gateways (conditions)
 *
 */
@Service
public class LeaveService {

	public void initLeave() {

		System.out.println("I am in class " + LeaveService.class + " method: initLeave");
	}

	public void approveRequest() {
		System.out.println("I am in class " + LeaveService.class + " method: approveRequest");
	}

	public void rejectRequest() {
		System.out.println("I am in class " + LeaveService.class + " method: rejectRequest");
	}

}
