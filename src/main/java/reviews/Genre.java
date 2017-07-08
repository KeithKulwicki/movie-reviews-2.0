package reviews;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	// Instance variables
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Lob
	private String description;

	private String genreImage;

	@OneToMany(mappedBy = "genre")
	private Set<Movie> movies;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getGenreImage() {
		return genreImage;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	// JPA needs this

	@SuppressWarnings("unused")
	private Genre() {
	}

	public Genre(String name, String description, String genreImage) {
		this.name = name;
		this.description = description;
		this.genreImage = genreImage;
	}

	@Override
	public String toString() {
		return name;
	}

}