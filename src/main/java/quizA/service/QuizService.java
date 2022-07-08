package quizA.service;

import java.util.Optional;

import quizA.entity.Quiz;

public interface QuizService {
	/** クイズ情報を全件取得します*/
	Iterable<Quiz> selectAll();
	
	/** クイズ情報、idをキーに1件取得します */
	Optional<Quiz> selectOneById(Integer id);
	
	/** クイズ情報をランダムに１件取得します*/
	Optional<Quiz> selectOneRandomQuiz();
	
	/** クイズの正解、不正解を判断します*/
	Boolean checkQuiz(Integer id, Boolean myAnswer);
	
	/** クイズを登録します*/
	void insertQuiz(Quiz quiz);
	
	/** クイズを更新します*/
	void updateQuiz(Quiz quiz);
	
	/** クイズを削除します*/
	void deleteQuizById(Integer id);
}
