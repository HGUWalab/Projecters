package com.walab.Projecters.Bean;

public class MyPageForm {
	String title;
	int form_count;
	int post_status;
	int form_id;
	int form_status;
	int post_id;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getForm_count() {
		return form_count;
	}
	public void setForm_count(int form_count) {
		this.form_count = form_count;
	}
	public int getPost_status() {
		return post_status;
	}
	public void setPost_status(int post_status) {
		this.post_status = post_status;
	}
	public int getForm_id() {
		return form_id;
	}
	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}
	public int getForm_status() {
		return form_status;
	}
	public void setForm_status(int form_status) {
		this.form_status = form_status;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
}

/*
 * SELECT Post.title, Post.form_count, Post.status, Form.form_id, Form.status, Form.post_id 
		FROM Form 
		LEFT JOIN Post 
		ON Post.post_id = Form.post_id WHERE Form.writer_id=#{id}
		UNION 
		SELECT Post.title, Post.form_count, Post.status, Form.form_id, Form.status, Form.post_id 
		FROM Form 
		RIGHT JOIN Post 
		ON Post.post_id = Form.post_id WHERE Form.writer_id=#{id}*/
 