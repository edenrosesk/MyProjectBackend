package lesson4.builder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lesson4.builder.Ingredient;
import lombok.Data;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

@Generated("jsonschema2pojo")
@Data
public class Value {

    @JsonProperty("ingredients")
    public List<Ingredient> ingredients = new ArrayList<Ingredient>();

}
