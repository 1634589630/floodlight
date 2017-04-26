package net.floodlightcontroller.statistics;

import net.floodlightcontroller.core.module.IFloodlightService;

public interface IPktinHistoryService extends IFloodlightService {
	public Long getPacket_InCount();
}
