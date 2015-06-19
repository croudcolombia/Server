package jobs;

import java.util.List;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;

public class Job {

	@Id

	private String id;
	
	private String text;
	
	private String username;

	private String title;
	
	private List<String> tags;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getId() {
		return id; 
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}	
}
