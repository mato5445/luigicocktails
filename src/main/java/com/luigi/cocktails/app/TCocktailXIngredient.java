package com.luigi.cocktails.app;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.luigi.cocktails.app.model.CocktailIngredientId;
import com.luigi.cocktails.app.model.TCocktail;
import com.luigi.cocktails.app.model.TIngredient;

@Entity
@Table(name = "t_cocktails_x_ingredients", schema = "co")
public class TCocktailXIngredient implements Serializable{
	
	@EmbeddedId
	private CocktailIngredientId id;
	
	@ManyToOne
	@MapsId("cocktail_id")
	@JoinColumn(name = "cocktail_id", nullable = false)
	private TCocktail cocktail;
	
	@ManyToOne
	@MapsId("ingredient_id")
	@JoinColumn(name = "ingredient_id", nullable = false)
	private TIngredient ingredient;
	
	public TCocktailXIngredient() {
		super();
	}
	
}
