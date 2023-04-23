//package loper.dev.quizam.question;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class QuestionConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(QuestionRepository repository) {
//        return args -> {
//            Question question1 = new Question("mom?", "family", "mom", List.of("bro", "papa", "granny"), List.of("abc", "bca"), "FAM", "hard", false, List.of("", ""));
//            Question question2 = new Question("papa?", "family", "papa", List.of("bro", "mom", "granny"), List.of("abc", "bca"), "FAM", "medium", false, List.of("", ""));
//
//            repository.saveAll(
//                    List.of(question1, question2)
//            );
//        };
//    }
//}
