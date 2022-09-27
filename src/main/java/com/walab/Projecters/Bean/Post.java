package com.walab.Projecters.Bean;

import org.springframework.web.multipart.MultipartFile;

public class Post {
	private int post_id;
	private int writer_id;
	private String title;
	private String content;
	private int status;
	private String mod_date;
	private String post_date;

	private String picturePath;
	


	private int ddib_count;
	private int form_count;

	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getWriter_id() {
		return writer_id;
	}
	public void setWriter_id(int writer_id) {
		this.writer_id = writer_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMod_date() {
		return mod_date;
	}
	public void setMod_date(String mod_date) {
		this.mod_date = mod_date;
	}
	public String getPost_date() {
		return post_date;
	}
	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}

	public int getDdib_count() {
		return ddib_count;
	}
	public void setDdib_count(int ddib_count) {
		this.ddib_count = ddib_count;
	}
	public int getForm_count() {
		return form_count;
	}
	public void setForm_count(int form_count) {
		this.form_count = form_count;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	
	
	
}
