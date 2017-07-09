package reviews;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@ManyToMany(mappedBy = "tags")
	private Set<Movie> taggedBy;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Movie> getTaggedBy() {
		return taggedBy;
	}

	private Tag() {
	}

	public Tag(String name) {
		this.name = name;
	}

}
