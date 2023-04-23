package loper.dev.quizam.question;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    public List<Question> allQuestions() {
        return questionRepository.findAll();

    }

    public Optional<Question> singleQuestion(ObjectId id) {
        return questionRepository.findById(id);
    }

    @Autowired
    private MongoTemplate mongoTemplate;

    public Question createQuestion(Question newQuestion) {
        return questionRepository.save(newQuestion);
    }

    public String deleteQuestion(ObjectId questionId) {
        boolean exists = questionRepository.existsById(questionId);
        if (!exists) {
            throw new IllegalStateException("Question with id " + questionId + "not found!");
        }
        questionRepository.deleteById(questionId);
        return "Question removed";
    }

    @Transactional
    public String updateQuestion(ObjectId questionId, String questionText, String correctAnswer) {
        Question question = questionRepository.findById(questionId).orElseThrow(() -> new IllegalStateException(
                "Question with id " + questionId + "not found!"
        ));

        if (questionText != null && questionText.length() > 0 && !Objects.equals(question.getQuestion(), questionText)) {
            question.setQuestion(questionText);
        }

        if (correctAnswer != null && correctAnswer.length() > 0 && !Objects.equals(question.getCorrectAnswer(), correctAnswer)) {
            question.setCorrectAnswer(correctAnswer);
        }

        return "Question " + questionId + "was updated.";
    }
}
