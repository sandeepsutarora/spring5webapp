package developer.springframework.spring5webapp.model.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer ookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @OneToOne
    private Notes notes;
    @Lob
    private Byte image;


    public Set<Ingredient> getIngredientSet() {
        return ingredientSet;
    }

    public void setIngredientSet(Set<Ingredient> ingredientSet) {
        this.ingredientSet = ingredientSet;
    }

    private Difficulty difficulty;

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredientSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getImage() {
        return image;
    }

    public void setImage(Byte image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getOokTime() {
        return ookTime;
    }

    public void setOokTime(Integer ookTime) {
        this.ookTime = ookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
