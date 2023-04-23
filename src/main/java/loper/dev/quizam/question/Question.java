package loper.dev.quizam.question;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quizes")
@Data
public class Question {
    @Id
    private ObjectId _id;
    private String id;
    private String question;
    private String category;
    private String correctAnswer;
    private List<String> incorrectAnswers;
    private List<String> tags;
    private String type;
    private String difficulty;
    private Boolean isNiche;
    private List<String> regions;

    public Question() {
    }

    public Question(ObjectId _id,
                    String id,
                    String question,
                    String category,
                    String correctAnswer,
                    List<String> incorrectAnswers,
                    List<String> tags,
                    String type,
                    String difficulty,
                    Boolean isNiche,
                    List<String> regions) {
        this._id = _id;
        this.id = id;
        this.question = question;
        this.category = category;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswers = incorrectAnswers;
        this.tags = tags;
        this.type = type;
        this.difficulty = difficulty;
        this.isNiche = isNiche;
        this.regions = regions;
    }

    public Question(String question,
                    String category,
                    String correctAnswer,
                    List<String> incorrectAnswers,
                    List<String> tags,
                    String type,
                    String difficulty,
                    Boolean isNiche,
                    List<String> regions) {
        this.question = question;
        this.category = category;
        this.correctAnswer = correctAnswer;
        this.incorrectAnswers = incorrectAnswers;
        this.tags = tags;
        this.type = type;
        this.difficulty = difficulty;
        this.isNiche = isNiche;
        this.regions = regions;
    }


}
