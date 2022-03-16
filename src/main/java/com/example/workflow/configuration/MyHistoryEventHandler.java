package com.example.workflow.configuration;

import java.util.List;

import org.camunda.bpm.engine.impl.history.event.HistoryEvent;
import org.camunda.bpm.engine.impl.history.handler.HistoryEventHandler;

public class MyHistoryEventHandler implements HistoryEventHandler {

	/**
	 * to override history event handler
	 * so we can put into the custom db or fire other events
	 */
	@Override
	public void handleEvent(HistoryEvent historyEvent) {
		System.out.println("eventId: " + historyEvent.getId() + " ProcessDefinitionId: " + historyEvent.getProcessDefinitionId());

	}

	@Override
	public void handleEvents(List<HistoryEvent> historyEvents) {
		// TODO Auto-generated method stub

	}

}
