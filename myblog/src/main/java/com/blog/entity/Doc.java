package com.blog.entity;

import java.sql.Blob;

public class Doc {
	private String docIdea;
	private String docName;
	private Blob docContent;
	private java.sql.Timestamp docDate;
	private String docAuthor;
	private String docAuthorId;
	private int docViewtimes;
	public String getDocIdea() {
		return docIdea;
	}
	public void setDocIdea(String docIdea) {
		this.docIdea = docIdea;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public Blob getDocContent() {
		return docContent;
	}
	public void setDocContent(Blob docContent) {
		this.docContent = docContent;
	}
	public java.sql.Timestamp getDocDate() {
		return docDate;
	}
	public void setDocDate(java.sql.Timestamp docDate) {
		this.docDate = docDate;
	}
	public String getDocAuthor() {
		return docAuthor;
	}
	public void setDocAuthor(String docAuthor) {
		this.docAuthor = docAuthor;
	}
	public String getDocAuthorId() {
		return docAuthorId;
	}
	public void setDocAuthorId(String docAuthorId) {
		this.docAuthorId = docAuthorId;
	}
	public int getDocViewtimes() {
		return docViewtimes;
	}
	public void setDocViewtimes(int docViewtimes) {
		this.docViewtimes = docViewtimes;
	}
}
