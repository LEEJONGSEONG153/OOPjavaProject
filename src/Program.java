public class Program {

    public static void main(String[] args) {
        NewLecExam exam = new NewLecExam();
        exam.setKor(10);
        exam.setEng(10);
        exam.setMath(10);
        exam.setCom(10);


        System.out.println(exam.total());
    }

}
