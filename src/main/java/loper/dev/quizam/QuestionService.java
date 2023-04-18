package loper.dev.quizam;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
