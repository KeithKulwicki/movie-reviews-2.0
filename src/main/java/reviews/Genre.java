package reviews;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	// Instance variables
	@Id
	@GeneratedValue
	public Long id;

	private String name;
	private String description;
	private String genreImage;

	@OneToMany(mappedBy = "genre")
	private Set<Movie> movies;

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

	public Genre(String name, String description, String genreImage) {
		this.name = name;
		this.description = description;
		this.genreImage = genreImage;
	}

	private Genre() {

	}

	@Override
	public String toString() {
		return name;
	}

}