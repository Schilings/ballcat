package com.hccake.ballcat.autoconfigure.websocket;

/**
 * websocket 消息分发器类型常量类
 *
 * @author hccake
 */
public final class MessageDistributorTypeConstants {

	private MessageDistributorTypeConstants() {
	}

	/**
	 * 本地
	 */
	public static final String LOCAL = "local";

	/**
	 * 基于 Redis PUB/SUB
	 */
	public static final String REDIS = "redis";

	/**
	 * 基于 rocketmq 广播
	 */
	public static final String ROCKETMQ = "rocketmq";

	/**
	 * 自定义
	 */
	public static final String CUSTOM = "custom";

}
