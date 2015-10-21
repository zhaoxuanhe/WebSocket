package com.socket;

import java.util.HashSet;
import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

public class WebsocketConfig implements ServerApplicationConfig {

	@Override
	public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
		// TODO Auto-generated method stub
		System.out.println("******getAnnotatedEndpointClasses******");
		Set<Class<?>> res=new HashSet<Class<?>>();
		for(Class<?> cs:scanned){
			if(cs.getPackage().getName().startsWith("com.socket.")){
				res.add(cs);
			}
		}
		return res;
	}

	@Override
	public Set<ServerEndpointConfig> getEndpointConfigs(
			Set<Class<? extends Endpoint>> arg0) {
		System.out.println("******getEndpointConfigs******");
		Set<ServerEndpointConfig> res=new HashSet<ServerEndpointConfig>();
		return res;
	}

}
