package reviews;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	@Lob
	private String description;

	@ManyToOne
	private Genre genre;

	public String getTitle() {
		return title;
	}

	@ManyToMany
	private Set<Tag> tags;

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	@Lob
	private String review;
	private String imageUrl;
	private String videoClip;

	public Genre getGenre() {
		return genre;
	}

	public String getReview() {
		return review;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public Boolean hasImageUrl() {
		return imageUrl != null;
	}

	public String getVideoClip() {
		return videoClip;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	@SuppressWarnings("unused")
	private Movie() {
	}

	public Movie(Genre genre, String title, String description, String review, String imageUrl, String videoClip,
			Tag... tags) {
		this.genre = genre;
		this.title = title;
		this.description = description;
		this.review = review;
		this.imageUrl = imageUrl;
		this.videoClip = videoClip;
		this.tags = new HashSet<>(Arrays.asList(tags));
	}

	public void remove(Tag tag) {
		tags.remove(tag);
	}

	@Override
	public String toString() {
		return String.format("A movie with id %s and title '%s'", id, title);
	}

	public void add(Tag tag) {
		tags.add(tag);

	}
}
