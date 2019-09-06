package fr.diginamic.Entites;

public class Post {

	Integer id;
	Integer userId;
	String title;
	String body;

	/**
	 * Constructeur
	 * 
	 */
	public Post() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param userId
	 * @param title
	 * @param body
	 */
	public Post(Integer id, Integer userId, String title, String body) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * Setter
	 * 
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter
	 * 
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * Setter
	 * 
	 * @param body
	 *            the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Post [id=" + id + ", userId=" + userId + ", title=" + title + ", body=" + body + "]";
	}

}
