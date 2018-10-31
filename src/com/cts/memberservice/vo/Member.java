package com.cts.memberservice.vo;

import java.util.List;

public class Member {
	
	private String memberName;
	private String memberId;
	private String subscription;
	private String email;
	private List<String> services;
	 
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberVO [memberName=");
		builder.append(memberName);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", subscription=");
		builder.append(subscription);
		builder.append(", services=");
		builder.append(services);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the subscription
	 */
	public String getSubscription() {
		return subscription;
	}

	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the services
	 */
	public List<String> getServices() {
		return services;
	}

	/**
	 * @param services the services to set
	 */
	public void setServices(List<String> services) {
		this.services = services;
	}

}
