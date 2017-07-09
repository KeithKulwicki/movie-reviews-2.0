package reviews;

import java.util.Collections;
import java.util.HashSet;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoviesController {

	@Resource
	private MovieRepository movieRepo;

	@Resource
	private GenreRepository genreRepo;

	@Resource
	private TagRepository tagRepo;

	@RequestMapping("/home")
	public String showHomepage() {
		return "home";
	}

	@RequestMapping("/genres")
	public String fetchGenre(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genreList";
	}

	@RequestMapping("/genre")
	public String fetchGenre(@RequestParam("id") Long id, Model model) {
		model.addAttribute(genreRepo.findOne(id));
		return "genreDetail";
	}

	@RequestMapping("/movies")
	public String fetchMovies(Model model) {
		model.addAttribute("movies", movieRepo.findAll());
		return "moviesList";
	}

	@RequestMapping("/movie")
	public String fetchMovieDetail(@RequestParam("id") long id, Model model) {
		Movie selectedMovie = movieRepo.findOne(id);
		model.addAttribute(selectedMovie);
		return "movieDetail";
	}

	@RequestMapping("/tags")
	public String showTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tagList";
	}

	@RequestMapping("/tag")
	public String fetchTagDetail(@RequestParam("id") Long id, Model model) {
		Tag selectedTag = tagRepo.findOne(id);
		model.addAttribute(selectedTag);
		return "tagDetail";
	}

	@RequestMapping("/createTag")
	public String createTag(@RequestParam(value = "id") Long id, String name) {
		Tag tag = new Tag(name);
		tagRepo.save(tag);
		Movie movie = movieRepo.findOne(id);
		movie.add(tag);
		movieRepo.save(movie);
		return "redirect:/movie?id=" + id;
	}

	@RequestMapping("/deleteTag")
	public String deleteTag(@RequestParam long tagId, @RequestParam long movieId) {
		Tag toDelete = tagRepo.findOne(tagId);
		for (Movie movie : toDelete.getTaggedBy()) {
			movie.remove(toDelete);
			movieRepo.save(movie);
		}

		tagRepo.delete(toDelete);
		return "redirect:/movie?id=" + movieId;
	}
}
