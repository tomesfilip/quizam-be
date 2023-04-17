package loper.dev.quizam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private class QuestionString {
        private String text;
    }

    @Id
    private ObjectId _id;
    private String questionId;
    private QuestionString question;
    private String category;
    private String correctAnswer;
    private List<String> incorrectAnswers;
    private List<String> tags;
    private String type;
    private String difficulty;
    private Boolean isNiche;
}
