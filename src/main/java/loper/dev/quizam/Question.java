package loper.dev.quizam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quizes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    private ObjectId _id;
    private String question;
    private String category;
    private String correctAnswer;
    private List<String> incorrectAnswers;
    private List<String> tags;
    private String type;
    private String difficulty;
    private Boolean isNiche;
    private List<String> regions;
}
