package reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity 
public class Review {
	
	//Instance variables
	@Id
	@GeneratedValue
	private long id;
	
	private String title;
	private String imageUrl;
	private String movieClip;
	
	@ManyToOne
	private Genre genre; //Foreign key 
	
	@Lob
	private String content;
	private String date;
	
	@Lob
	private String synopsis;
	
	//Constructor
	public Review(Genre genre, String title, String content, String date, 
			String synopsis, String imageUrl, String movieClip){
	 this.genre = genre;
	 this.title = title;
	 this.content = content;
	 this.date = date;
	 this.synopsis = synopsis;
	 this.imageUrl = imageUrl;
	 this.movieClip = movieClip;
	}
	
	//No argument constructor required for JPA
		private Review() {}
	
	//Getters
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getMovieClip() {
		return movieClip;
	}
	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public Genre getGenre() {
		return genre;
	}
}