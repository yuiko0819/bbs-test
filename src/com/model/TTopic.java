package com.model;

import java.util.Date;

/**
 * TTopic entity.
 * 
 * @author JHY
 */

public class TTopic implements java.io.Serializable {

	// Fields

	private Integer pid;// 帖子号
	private Integer fid;// 分区号
	private String author;// 作者
	private Integer authorid;// 作者号
	private String subject;// 标题
	private Integer view;// 浏览数
	private Integer replies;// 回复数
	private Date addtime;// 添加时间
	private String fname;// 分区名
	private TThreads lastsub;// 最后回复
	private String style;// 帖子状态
	// Constructors
	
	/** default constructor */
	public TTopic() {
	}

	/** full constructor */
	public TTopic(Integer fid, String author, Integer authorid, String subject,
			Integer view, Integer replies, Date addtime) {
		this.fid = fid;
		this.author = author;
		this.authorid = authorid;
		this.subject = subject;
		this.view = view;
		this.replies = replies;
		this.addtime = addtime;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getAuthorid() {
		return this.authorid;
	}

	public void setAuthorid(Integer authorid) {
		this.authorid = authorid;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getView() {
		return this.view;
	}

	public void setView(Integer view) {
		this.view = view;
	}

	public Integer getReplies() {
		return this.replies;
	}

	public void setReplies(Integer replies) {
		this.replies = replies;
	}

	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public TThreads getLastsub() {
		return lastsub;
	}

	public void setLastsub(TThreads lastsub) {
		this.lastsub = lastsub;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
}