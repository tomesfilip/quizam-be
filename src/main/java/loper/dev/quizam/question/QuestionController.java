package loper.dev.quizam.question;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        return new ResponseEntity<List<Question>>(questionService.allQuestions(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Question>> getSingleQuestion(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Question>>(questionService.singleQuestion(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Question> createQuestion(@RequestBody Question newQuestion) {
        return new ResponseEntity<Question>(questionService.createQuestion(newQuestion), HttpStatus.CREATED);
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity<String> deleteQuestion(@PathVariable ObjectId questionId) {
        return new ResponseEntity<String>(questionService.deleteQuestion(questionId), HttpStatus.OK);
    }

    @PutMapping("/{questionId}")
    public ResponseEntity<String> updateQuestion(
            @PathVariable ObjectId questionId,
            @RequestParam(required=false) String questionText,
            @RequestParam(required = false) String correctAnswer) {
        return new ResponseEntity<String>(questionService.updateQuestion(questionId, questionText, correctAnswer),
                HttpStatus.OK);
    }
}
