package com.blog.entity;

public class Reply {

	private String replyId;
	private String replyName;
	private java.sql.Timestamp replyTime;
	private String replyDocId;
	private java.sql.Blob replyContent;
	public String getReplyId() {
		return replyId;
	}
	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}
	public String getReplyName() {
		return replyName;
	}
	public void setReplyName(String replyName) {
		this.replyName = replyName;
	}
	public java.sql.Timestamp getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(java.sql.Timestamp replyTime) {
		this.replyTime = replyTime;
	}
	public String getReplyDocId() {
		return replyDocId;
	}
	public void setReplyDocId(String replyDocId) {
		this.replyDocId = replyDocId;
	}
	public java.sql.Blob getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(java.sql.Blob replyContent) {
		this.replyContent = replyContent;
	}
	
	
}
