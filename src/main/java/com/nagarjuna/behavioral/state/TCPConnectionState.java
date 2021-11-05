package com.nagarjuna.behavioral.state;

public interface TCPConnectionState {
	
	void open();
	void close();
	void acknowledge() throws Exception;

}
